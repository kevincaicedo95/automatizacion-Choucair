package com.automatizacion.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import java.time.Duration;

import static com.automatizacion.web.userInterface.PaginaAgregarAlCarrito.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarrito implements Task {

    public static AgregarAlCarrito producto(){
        return instrumented(AgregarAlCarrito.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(CATEGORIA_COMPUTADORES),
                Click.on(SUBCATEGORIA_PORTATILES.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(BUTTON_AGREGAR_AL_CARRITO),
                Scroll.to(LINK_PAGAR),
                Click.on(LINK_PAGAR.waitingForNoMoreThan(Duration.ofSeconds(5)))
        );

    }
}
