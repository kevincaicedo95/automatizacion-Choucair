package com.automatizacion.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automatizacion.web.userInterface.PaginaCompletarPago.LB_COMPRA_COMPLETA;

public class MensajeCompraCompletada implements Question<Boolean> {

    public static MensajeCompraCompletada EnPaginaWeb(){
        return new MensajeCompraCompletada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LB_COMPRA_COMPLETA.resolveFor(actor).isVisible();
    }
}
