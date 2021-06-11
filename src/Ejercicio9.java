package src;

import java.util.Scanner;

public class Ejercicio9 {

    Scanner entrada = new Scanner(System.in);
    int[][] matriz1;
    int[][] matriz2;
    int[][] suma;

    public Ejercicio9() {
        crearMatrices();
        llenarMatrices();
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);
        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);
        System.out.println("SUMA:");
        sumarMatrices();
        mostrarMatriz(suma);
    }

    public void crearMatrices() {
        int filas;
        int columnas;

        System.out.println("Ingrese el numero de filas");
        filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = entrada.nextInt();

        matriz1 = new int[filas][columnas];
        matriz2 = new int[filas][columnas];
        suma = new int[filas][columnas];
    }

    public void sumarMatrices() {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    public void llenarMatrices() {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Ingrese el valor para la posicion: [" + i + "]" + "[" + j + "] (Array1): ");
                matriz1[i][j] = entrada.nextInt();
                System.out.println("Ingrese el valor para la posicion: [" + i + "]" + "[" + j + "] (Array2): ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
    }

    public void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ejercicio9 ejercicio = new Ejercicio9();
    }
}
