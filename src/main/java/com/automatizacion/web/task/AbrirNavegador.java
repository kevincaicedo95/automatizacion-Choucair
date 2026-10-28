package com.automatizacion.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {
    public static AbrirNavegador paraComenzarAutomatizacion(){
        return instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://demowebshop.tricentis.com/")
        );
    }
}
