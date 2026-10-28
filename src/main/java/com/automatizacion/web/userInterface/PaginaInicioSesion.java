package com.automatizacion.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion {
    public static final Target INPUT_CORREO = Target.the("input correo").locatedBy("#Email");
    public static final Target INPUT_CONTRASENA = Target.the("input contraseña").locatedBy("#Password");
    public static final Target BUTTON_INICIAR_SESION = Target.the("boton iniciar sesion").locatedBy(".button-1.login-button");
}
