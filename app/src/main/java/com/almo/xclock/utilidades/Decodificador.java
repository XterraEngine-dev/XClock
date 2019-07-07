package com.almo.xclock.utilidades;
/**
 * create by: Luis Cifuentes 7/7/2019
 */

public class Decodificador {

    public String controladorHora(int hora) {
        String valor;
        if (hora <= 9) {
            valor = "0" + hora;
        } else {
            valor = "" + hora;
        }
        return valor;
    }

    public String controladorMinuto(int minuto) {
        String valor;
        if (minuto <= 9) {
            valor = "0" + minuto;
        } else {
            valor = "" + minuto;
        }
        return valor;
    }

    public String controladoSegundos(int segundos) {
        String valor;
        if (segundos <= 9) {
            valor = "0" + segundos;
        } else {
            valor = "" + segundos;
        }
        return valor;
    }


}
