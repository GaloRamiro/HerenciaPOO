package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

    public static void main(String[] args) {

        Padre p = new Padre(1, 1, "Padre");
        p.ahorrar(120);
        System.out.println(p);

        Hija h1 = new Hija(1, 1, "Hija");
        h1.ahorrar(120);
        System.out.println(h1);

        Hijo h2 = new Hijo(1, 1, 1, "Hijo");
        h2.ahorrar(120);
        System.out.println(h2);
    }
}