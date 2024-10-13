package com.store.steps;

import com.store.utils.Base;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class registerSteps extends Base {

    @Dado("El visitante esta en la pagina de registro {string}")
    public void el_visitante_esta_en_la_pagina_de_registro(String url) {
        driver.get(url);
    }

    @Cuando("el visitante complete la informacion {string} {string} {string} {string}")
    public void el_visitante_complete_la_informacion(String email, String password, String repassword, String securityAnswer) {
        registerFactory.alertDismis();
        registerFactory.fillOutForm(email, password, repassword, securityAnswer);
    }

    @Cuando("el visitante hace click en registrarse")
    public void el_visitante_hace_click_en_registrarse() {
        registerFactory.clickRegister();
    }

    @Entonces("deberia tener su cuenta creada")
    public void deberia_tener_su_cuenta_creada() {
        System.out.print("ok");
    }

}