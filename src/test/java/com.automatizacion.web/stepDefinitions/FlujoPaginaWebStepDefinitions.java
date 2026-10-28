package com.automatizacion.web.stepDefinitions;

import com.automatizacion.web.questions.MensajeCompraCompletada;
import com.automatizacion.web.questions.MensajeRegistroCompleto;
import com.automatizacion.web.task.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoPaginaWebStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("kevin");
    }

    @Dado("Que el usuario ingresa a la aplicación")
    public void que_el_usuario_ingresa_a_la_aplicación() {
        theActorInTheSpotlight().attemptsTo(
                AbrirNavegador.paraComenzarAutomatizacion()

        );
    }

    @Cuando("el usuario realiza correctamente el registo")
    public void el_usuario_realiza_correctamente_el_registo() {
        theActorInTheSpotlight().attemptsTo(Registrar.usurio());
    }

    @Entonces("debe aparecer un mensaje de registro exitoso")
    public void debe_aparecer_un_mensaje_de_registro_exitoso() {
        theActorInTheSpotlight().should(seeThat(MensajeRegistroCompleto.esVisible()));
    }


    @Y("se registra con el correo {} y contraseña {}")
    public void seRegistraConElCorreoYContrasena (String correo, String contrasena) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enPAginaWeb(correo,contrasena));
    }

    @Cuando("Agrega un producto al carrito")
    public void agrega_un_producto_al_carrito() {
        theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.producto());
    }

    @Y("termina el proceso de compra")
    public void termina_el_proceso_de_compra() {
        theActorInTheSpotlight().attemptsTo(CompletarPago.conTarjeta());
    }

    @Entonces("debe aparecer un mensaje indicando que la compra fue correcta")
    public void debe_aparecer_un_mensaje_indicando_que_la_compra_fue_correcta() {
        theActorInTheSpotlight().should(seeThat(MensajeCompraCompletada.EnPaginaWeb()));
    }
}
