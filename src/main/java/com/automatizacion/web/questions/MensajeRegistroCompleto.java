package com.automatizacion.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automatizacion.web.userInterface.PaginaRegistrarse.LB_REGISTRO_COMPLETO;

public class MensajeRegistroCompleto implements Question<Boolean> {

    public static MensajeRegistroCompleto esVisible(){
        return new MensajeRegistroCompleto();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LB_REGISTRO_COMPLETO.resolveFor(actor).containsText("Your registration completed");
    }
}
