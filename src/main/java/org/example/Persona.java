package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int fechaIngreso;
    private double sueldoBruto;
    private double dsctoAfp = 0.1321;
    private double precioHora;
    private int horasExtras;
    private int faltas;


    public Persona(String nombre, String apellido, String dni, int fechaIngreso, double sueldoBruto, int horasExtras, int faltas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.sueldoBruto = sueldoBruto;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getDsctoAfp() {
        return dsctoAfp;
    }

    public void setDsctoAfp(double dsctoAfp) {
        this.dsctoAfp = sueldoBruto * dsctoAfp;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double calcularCTS(double sueldoBruto) {
        return sueldoBruto/6;
    }

    public double calcularBonoAntiguedad(int fechaIngreso) {
        int anios = 2022-fechaIngreso;

        return anios * 100.0;
    }

    public double calcularDsctoFaltas(int faltas) {
        return faltas*180;
    }

    public double calcularDsctoAfp() {
        return getDsctoAfp()*sueldoBruto;
    }

    public double calcularSueldoNeto() {
        return sueldoBruto - (calcularDsctoAfp() +  calcularDsctoFaltas(faltas));
    }
}