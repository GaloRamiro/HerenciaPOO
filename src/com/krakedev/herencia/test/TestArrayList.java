package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<Hija> listaDeHijas = new ArrayList<Hija>();

        Hija hija1 = new Hija(2, 4, "Ana");
        listaDeHijas.add(hija1);

        Hija hija2 = new Hija(1, 1, "María");
        listaDeHijas.add(hija2);

        Hija hija3 = new Hija(10, 3, "Carolina");
        listaDeHijas.add(hija3);

        System.out.println(listaDeHijas);
    }
}