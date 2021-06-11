package src;

public class Ejercicio2 {

    int[] numeros = new int[10];
    int mayor = 0;
    int contadorMayor = 0;

    public Ejercicio2() {
        llenarArreglo();
        buscarMayor();
        contadorNumeroMayor();

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero mayor se repite " + contadorMayor + " veces");
    }

    public void buscarMayor() {
        mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
    }

    public void contadorNumeroMayor() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == mayor) {
                contadorMayor++;
            }
        }
    }

    public void llenarArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarNumAleatorio(0, 99);
        }
    }

    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
    }
}