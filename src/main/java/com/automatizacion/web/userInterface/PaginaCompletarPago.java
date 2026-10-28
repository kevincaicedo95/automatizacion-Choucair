package com.automatizacion.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCompletarPago {
    public static final Target CB_COMPRAR = Target.the("checkbox para comprar").locatedBy("//td[@class='remove-from-cart']//input[@type='checkbox']");
    public static final Target CB_ACEPTAR_TYC = Target.the("checkbox aceptar Terminos y condiciones").locatedBy("#termsofservice");
    public static final Target BUTTON_CHECKOUT = Target.the("boton checkout").locatedBy("#checkout");
    public static final Target SELECT_DIRECCION = Target.the("Seleccionar pais").locatedBy("#billing-address-select");
    public static final Target SELECT_PAIS = Target.the("Seleccionar pais").locatedBy("#BillingNewAddress_CountryId");
    public static final Target INPUT_CIUDAD = Target.the("Input ciudad").locatedBy("#BillingNewAddress_City");
    public static final Target INPUT_DIRECCION = Target.the("Input direccion").locatedBy("#BillingNewAddress_Address1");
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Input codigo postal").locatedBy("#BillingNewAddress_ZipPostalCode");
    public static final Target INPUT_TELEFONO = Target.the("Input telefono").locatedBy("#BillingNewAddress_PhoneNumber");
    public static final Target BUTTON_CONTINUAR = Target.the("Boton continuar direccion").locatedBy(".button-1.new-address-next-step-button");
    public static final Target BUTTON_CONTINUAR_DIRECCION_TIENDA = Target.the("Boton continuar direccion de local").locatedBy("//*[@id='shipping-buttons-container']//input");
    public static final Target BUTTON_CONTINUAR_METODO_ENTREGA = Target.the("Boton continuar metodo de entrega").locatedBy(".button-1.shipping-method-next-step-button");
    public static final Target RB_TARJETA_CREDITO = Target.the("RadioButton tarjeta de credito").locatedBy("#paymentmethod_2");
    public static final Target BUTTON_CONTINUAR_METODO_PAGO = Target.the("Boton continuar metodo de pago").locatedBy(".button-1.payment-method-next-step-button");
    public static final Target SELECT_TARJETA_CREDITO = Target.the("Seleccionar tarjeta de credito").locatedBy("#CreditCardType");
    public static final Target INPUT_TITULAR_TARJETA = Target.the("input titular tarjeta").locatedBy("#CardholderName");
    public static final Target INPUT_NUMERO_TARJETA = Target.the("input numero de tarjeta").locatedBy("#CardNumber");
    public static final Target SELECT_MES = Target.the("Seleccionar mes").locatedBy("#ExpireMonth");
    public static final Target SELECT_ANIO = Target.the("Seleccionar anio").locatedBy("#ExpireYear");
    public static final Target INPUT_CODIGO = Target.the("Input codigo tarjeta").locatedBy("#CardCode");
    public static final Target BUTTON_CONTINUAR_DATOS_TARJETA = Target.the("Boton continuar datos tarjeta").locatedBy(".button-1.payment-info-next-step-button");
    public static final Target BUTTON_CONFIRMAR = Target.the("Boton confirmar").locatedBy(".button-1.confirm-order-next-step-button");
    public static final Target LB_COMPRA_COMPLETA = Target.the("texto de compra completa").locatedBy("//strong[contains(.,'Your order has been successfully processed!')]");





}
