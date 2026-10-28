package com.automatizacion.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {
    public static final Target LINK_REGISTRAR = Target.the("boton registrarse").locatedBy(".ico-register");
    public static final Target LINK_INICIAR_SESION = Target.the("boton iniciar sesion").locatedBy(".ico-login");
}
