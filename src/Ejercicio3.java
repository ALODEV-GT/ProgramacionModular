package src;

import java.util.Scanner;

public class Ejercicio3 {

    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[8];
    int numeroABuscar;

    public Ejercicio3() {
        llenarArreglo();
        pedirDato();
        System.out.println("Se encontro el numero?: " + buscarNumero(numeroABuscar));
    }

    public void pedirDato() {
        System.out.println("Ingrese el numero a buscar");
        numeroABuscar = entrada.nextInt();
    }

    public boolean buscarNumero(int numeroABuscar) {
        boolean seEncontro = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                seEncontro = true;
                break;
            }
        }
        return seEncontro;
    }

    public void llenarArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarNumAleatorio(1, 9);
        }
    }

    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
    }
}
