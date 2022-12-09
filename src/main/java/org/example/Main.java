package org.example;

public class Main {
    public static void main(String[] args) {

        Operario oper1 = new Operario("Operario1", "Apellido", "12345678", 2020, 2000, 10, 2, true);

        System.out.println(oper1.calcularSueldoNeto());
        System.out.println(oper1.calcularDsctoAfp());

        Ejecutivo ejecu1 = new Ejecutivo("ejecutivo1", "apellido", "87654321", 2019, 5000, 2, 1, 100);

        System.out.println(ejecu1.calcularSueldoNeto());
        System.out.println(ejecu1.calcularDsctoAfp());
    }
}