package com.automatizacion.web.task;

import com.automatizacion.web.utils.Utileria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automatizacion.web.userInterface.PaginaInicio.LINK_REGISTRAR;
import static com.automatizacion.web.userInterface.PaginaRegistrarse.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {

    public static Registrar usurio(){
        return instrumented(Registrar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_REGISTRAR),
                Click.on(CB_GENERO_MASCULINO),
                Enter.theValue("Kevin").into(INPUT_PRIMER_NOMBRE),
                Enter.theValue("Caicedo").into(INPUT_PRIMER_APELLIDO),
                Enter.theValue("kevinPrueba"+ Utileria.numeroaleatorio()+"@gmail.com").into(INPUT_CORREO_ELECTRONICO),
                Enter.theValue("Prueba123##").into(INPUT_CONTRASENA),
                Enter.theValue("Prueba123##").into(INPUT_CONFIRMAR_CONTRASENA),
                Click.on(BUTTON_REGISTRAR)
        );
    }
}
