package com.krakedev.herencia;

public class Padre {

    private int defectos;
    private int virtudes;
    private double totalAhorrado;
    private String nombre;

    public Padre(int virtudes, int defectos, String nombre) {
        this.defectos = defectos;
        this.virtudes = virtudes;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()
                + " Defectos: " + getDefectos()
                + " Virtudes: " + getVirtudes()
                + " Ahorros: " + getTotalAhorrado();
    }

    public void ahorrar(double monto) {
        totalAhorrado += monto;
    }

    public double getTotalAhorrado() {
        return totalAhorrado;
    }

    public void setTotalAhorrado(double totalAhorrado) {
        this.totalAhorrado = totalAhorrado;
    }

    public int getDefectos() {
        return defectos;
    }

    public void setDefectos(int defectos) {
        this.defectos = defectos;
    }

    public int getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(int virtudes) {
        this.virtudes = virtudes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Virtudes: " + virtudes);
        System.out.println("Defectos: " + defectos);
    }

    public void guardarSecreto() {
        System.out.println("Esto no se hereda");
    }
}