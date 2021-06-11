package src;

import java.util.Scanner;

public class Ejercicio5 {

    Scanner entrada = new Scanner(System.in);
    int[] notas = new int[100];
    int nota;

    public Ejercicio5() {
        int opcion = 0;
        do {
            System.out.println("1.- Ingresar notas");
            System.out.println("2.- Salir");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                obtenerPromedioNotas();
            }
        } while (opcion != 2);

    }

    public void obtenerPromedioNotas() {
        nota = 0;
        inicializarArreglo();
        pedirNotas();
        System.out.println("La media de las notas es: " + calcularMedia());
    }

    public void inicializarArreglo() {
        for (int i = 0 ; i < notas.length; i++) {
            notas[i] = 0;
        }
    }

    public void pedirNotas() {
        int indice = 0;
        do {
            ingresarNota(indice);
            indice++;
        } while (nota != -50);
    }

    public void ingresarNota(int indice) {
        System.out.println("Ingrese la nota " + (indice + 1) + " : ");
        notas[indice] = entrada.nextInt();
        nota = notas[indice];
    }

    public double calcularMedia() {
        int suma = 0;
        double media = 0;
        int contadorNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -50) {
                break;
            }
            suma += notas[i];
            contadorNotas++;
        }

        media = (double)suma / contadorNotas;
        return media;
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio = new Ejercicio5();
    }
}
