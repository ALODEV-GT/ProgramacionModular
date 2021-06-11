package src;

import java.util.Scanner;

public class Ejercicio8 {

    Scanner entrada = new Scanner(System.in);
    String[] array1 = new String[5];
    String[] array2 = new String[5];

    public Ejercicio8() {
        pedirPalabras();
        compararArreglos();
    }

    public void pedirPalabras() {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Ingrese la palabra (Array 1)");
            array1[i] = entrada.next();
            System.out.println("Ingrese la palabra (Array 2)");
            array2[i] = entrada.next();
        }
    }

    public int obtenerTamanio(String palabra) {
        int tamanio = palabra.length();
        return tamanio;
    }

    public void compararArreglos() {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("indice: " + i + " tamanio palabra A1-" + (i + 1) + " : " + obtenerTamanio(array1[i])
                    + " tamanio palabra A2-" + (i + 1) + " : " + obtenerTamanio(array2[i]));
            if (obtenerTamanio(array1[i]) == obtenerTamanio(array2[i])) {
                System.out.println("Tienen el mismo tamanio");
            } else {
                System.out.println("No tienen el mismo tamanio");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio8 ejercicio = new Ejercicio8();
    }
}
