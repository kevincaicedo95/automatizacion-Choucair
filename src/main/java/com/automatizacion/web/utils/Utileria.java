package com.automatizacion.web.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Utileria {
    private Utileria(){}

    public static String numeroaleatorio(){
        int numero = ThreadLocalRandom.current().nextInt(1,200);
        return String.valueOf(numero);
    }
}
