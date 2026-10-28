package com.automatizacion.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automatizacion.web.userInterface.PaginaInicio.LINK_INICIAR_SESION;
import static com.automatizacion.web.userInterface.PaginaInicioSesion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private String correo;
    private String contrasena;

    public IniciarSesion (String correo,String contrasena){
        this.contrasena=contrasena;
        this.correo=correo;
    }
    public static IniciarSesion enPAginaWeb(String correo,String contrasena){
        return instrumented(IniciarSesion.class,correo,contrasena);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_INICIAR_SESION),
                Enter.theValue(correo).into(INPUT_CORREO),
                Enter.theValue(contrasena).into(INPUT_CONTRASENA),
                Click.on(BUTTON_INICIAR_SESION)
        );
    }
}
