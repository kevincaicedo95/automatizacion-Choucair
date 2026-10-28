package com.automatizacion.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistrarse {
    public static final Target CB_GENERO_MASCULINO = Target.the("checkBox Genero masculino").locatedBy("#gender-male");
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("input primer nombre").locatedBy("#FirstName");
    public static final Target INPUT_PRIMER_APELLIDO = Target.the("input primer apellido").locatedBy("#LastName");
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("input correo electronico").locatedBy("#Email");
    public static final Target INPUT_CONTRASENA= Target.the("input contraseña").locatedBy("#Password");
    public static final Target INPUT_CONFIRMAR_CONTRASENA= Target.the("input confirmar contraseña").locatedBy("#ConfirmPassword");
    public static final Target BUTTON_REGISTRAR = Target.the("botón registrar").locatedBy("#register-button");
    public static final Target LB_REGISTRO_COMPLETO = Target.the("Texto de registro completo").locatedBy(".result");
}
