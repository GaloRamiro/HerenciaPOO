package com.krakedev.herencia;

public class Hija extends Padre {

    public Hija(int virtudes, int defectos, String nombre) {
        super(virtudes, defectos, nombre);
    }

    public void escucharBadBunny() {
        System.out.println("Ella es calladita");
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()
                + " Defectos: " + super.getDefectos()
                + " Virtudes: " + super.getVirtudes()
                + " Ahorros: " + super.getTotalAhorrado();
    }
}