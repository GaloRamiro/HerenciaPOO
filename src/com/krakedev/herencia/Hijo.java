package com.krakedev.herencia;

public class Hijo extends Padre {

    private int juguetes;

    public Hijo(int virtudes, int defectos, int juguetes, String nombre) {
        super(virtudes, defectos, nombre);
        this.juguetes = juguetes;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public void ahorrar(double monto) {
        super.ahorrar(monto * 0.50);
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()
                + " Defectos: " + super.getDefectos()
                + " Virtudes: " + super.getVirtudes()
                + " Juguetes: " + juguetes
                + " Ahorros: " + super.getTotalAhorrado();
    }
}