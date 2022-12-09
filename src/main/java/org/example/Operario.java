package org.example;

public class Operario extends Persona{

    private int faltas;
    private boolean viajeProvincia;

    public boolean isViajeProvincia() {
        return viajeProvincia;
    }

    public void setViajeProvincia(boolean viajeProvincia) {
        this.viajeProvincia = viajeProvincia;
    }

    public Operario(String nombre, String apellido, String dni, int fechaIngreso, double sueldoBruto, int horasExtras, int faltas, boolean viajeProvincia) {
        super(nombre, apellido, dni, fechaIngreso, sueldoBruto, horasExtras, faltas);
        this.viajeProvincia = viajeProvincia;
    }


    public double calcularPagoHorasExtras( int horasExtras) {
        double hrs;
        hrs = getHorasExtras() * 50.0;
        return hrs;
    }


    public double bonoViajeProvincia() {
        double bono;
        if (viajeProvincia) {
            bono = 200.0;
        } else {
            bono = 0.0;
        }
        return bono;
    }

    public double calcularSueldoNeto() {
        return super.calcularSueldoNeto() + calcularPagoHorasExtras(getHorasExtras()) + bonoViajeProvincia();
    }
}