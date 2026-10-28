package com.automatizacion.web.task;

import com.automatizacion.web.utils.Utileria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static com.automatizacion.web.userInterface.PaginaCompletarPago.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarPago implements Task {
    public static CompletarPago conTarjeta(){
        return instrumented(CompletarPago.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CB_COMPRAR),
                Click.on(CB_ACEPTAR_TYC),
                Click.on(BUTTON_CHECKOUT));
        actor.attemptsTo(
                Check.whether(SELECT_DIRECCION.resolveFor(actor).isVisible())
                        .andIfSo(SelectFromOptions.byVisibleText("New Address").from(SELECT_DIRECCION))
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Colombia").from(SELECT_PAIS),
                Enter.theValue("Pasto").into(INPUT_CIUDAD),
                Enter.theValue("CLL "+ Utileria.numeroaleatorio()+" #45-70").into(INPUT_DIRECCION),
                Enter.theValue("0001").into(INPUT_CODIGO_POSTAL),
                Enter.theValue("78542658").into(INPUT_TELEFONO),
                Click.on(BUTTON_CONTINUAR),
                Click.on(BUTTON_CONTINUAR_DIRECCION_TIENDA),
                Click.on(BUTTON_CONTINUAR_METODO_ENTREGA),
                Click.on(RB_TARJETA_CREDITO),
                Click.on(BUTTON_CONTINUAR_METODO_PAGO),
                SelectFromOptions.byVisibleText("Visa").from(SELECT_TARJETA_CREDITO),
                Enter.theValue("Barbara Gordon").into(INPUT_TITULAR_TARJETA),
                Enter.theValue("4485564059489345").into(INPUT_NUMERO_TARJETA),
                SelectFromOptions.byVisibleText("04").from(SELECT_MES),
                SelectFromOptions.byVisibleText("2039").from(SELECT_ANIO),
                Enter.theValue("123").into(INPUT_CODIGO),
                Click.on(BUTTON_CONTINUAR_DATOS_TARJETA),
                Click.on(BUTTON_CONFIRMAR)





        );
    }
}
