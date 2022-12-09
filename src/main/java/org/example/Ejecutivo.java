package org.example;

public class Ejecutivo extends Persona{

    private double ventaMensual;

    public double getVentaMensual() {
        return ventaMensual;
    }

    public void setVentaMensual(double ventaMensual) {
        this.ventaMensual = ventaMensual;
    }

    public Ejecutivo(String nombre, String apellido, String dni, int fechaIngreso, double sueldoBruto, int horasExtras, int faltas, double ventaMensual) {
        super(nombre, apellido, dni, fechaIngreso, sueldoBruto, horasExtras, faltas);
        this.ventaMensual = ventaMensual;
    }

    public void setPrecioHora(double precioHora) {
        super.setPrecioHora(80.0);
    }

    public double calcularBonoVenta (){
        double bonoPorVenta;
        bonoPorVenta = ventaMensual*0.05;

        return bonoPorVenta;
    }

    public double calcularPagoHorasExtras( int horasExtras) {
        double hrs;
        hrs = getHorasExtras() * 80.0;
        return hrs;
    }

    public double calcularSueldoNeto() {
        return super.calcularSueldoNeto() + calcularPagoHorasExtras(getHorasExtras()) + calcularBonoVenta();
    }
}