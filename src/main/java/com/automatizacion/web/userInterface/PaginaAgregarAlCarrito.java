package com.automatizacion.web.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaAgregarAlCarrito {
    public static final Target CATEGORIA_COMPUTADORES = Target.the("Categoria Computadores").locatedBy("//ul[@class='top-menu']//a[@href='/computers']");
    public static final Target SUBCATEGORIA_PORTATILES = Target.the("Subcategoria portatiles").locatedBy("//ul[@class='top-menu']//a[@href='/notebooks']");
    public static final Target BUTTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").locatedBy("//input[@value='Add to cart']");
    public static final Target LINK_PAGAR = Target.the("Link para pagar").locatedBy("#topcartlink");
}
