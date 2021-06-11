package src;

import java.util.Scanner;

public class Ejercicio11 {
    Scanner entrada = new Scanner(System.in);
    double[] notas = new double[6];
    String[] nombres = new String[6];

    public Ejercicio11() {
        ingresarDatosAlumnos();
        mostrarDatosAlumnos();
    }

    public void pedirDatos(int indice) {
        boolean correcto = false;
        System.out.println("Ingrese nombre del alumno " + (indice + 1));
        nombres[indice] = entrada.next();

        do {
            System.out.println("Ingrese la nota del alumno " + (indice + 1));
            notas[indice] = entrada.nextDouble();

            if (notas[indice] >= 0 && notas[indice] <= 10) {
                correcto = true;
            } else {
                System.out.println("Ingresa una nota entre 0 y 10");
            }

        } while (!correcto);
    }

    public void ingresarDatosAlumnos() {
        for (int i = 0; i < nombres.length; i++) {
            pedirDatos(i);
        }
    }

    public void mostrarDatosAlumnos() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Nota: " + notas[i] + "; " + describirNota(notas[i]));
        }
    }

    public String describirNota(double nota) {
        String descripcionNota;

        if (nota >= 0 && nota <= 4.99) {
            descripcionNota = "Suspenso";
        } else if (nota >= 5 && nota <= 6.99) {
            descripcionNota = "Bien";
        } else if (nota >= 7 && nota <= 8.99) {
            descripcionNota = "Notable";
        } else {
            descripcionNota = "Sobresaliente";
        }
        return descripcionNota;
    }

    public static void main(String[] args) {
        Ejercicio11 ejercicio = new Ejercicio11();
    }
}
