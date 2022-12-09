package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaIngreso;
    private double sueldoBruto;
    private double dsctoAfp;
    private double precioHora;
    private int horasExtras;


    public Persona(String nombre, String apellido, String dni, String fechaIngreso, double sueldoBruto, double dsctoAfp, double precioHora, int horasExtras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.sueldoBruto = sueldoBruto;
        this.dsctoAfp = dsctoAfp;
        this.precioHora = precioHora;
        this.horasExtras = horasExtras;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
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
        this.dsctoAfp = dsctoAfp;
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



}