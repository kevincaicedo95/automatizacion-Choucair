package com.automatizacion.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flujo_pagina_web.feature",
        glue = "com.automatizacion.web.stepDefinitions"
)
public class AutomatizacionPaginaweb {
}
