package com.almo.xclock.utilidades;

/**
 * create by: Luis Cifuentes 7/7/2019
 */

public class Renderizador {

    public char renderDefOne(String entrada) {
        return entrada.charAt(0);
    }

    public char renderDefTwo(String entrada) {
        return entrada.charAt(1);
    }

    public int horas(int entrada) {
        return entrada / 3600;
    }

    public int minutos(int entrada) {
        return (entrada - (3600 * new Renderizador().horas(entrada))) / 60;
    }

    public int segundos(int entrada) {
        return entrada - ((new Renderizador().horas(entrada) * 3600) + (new Renderizador().minutos(entrada) * 60));
    }
}
