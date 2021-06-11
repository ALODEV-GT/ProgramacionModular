package src;

public class Ejercicio4 {

    int[] numeros = new int[10];
    int mayor;

    public Ejercicio4() {
        llenarArreglo();
        buscarMayor();
        calcularDiferencia();
    }

    public void calcularDiferencia() {
        for (int i = 0; i < numeros.length; i++) {
            int diferencia = mayor - numeros[i];
            System.out.println("La diferencia entre " + numeros[i] + " y el numero mayor es: " + diferencia);
        }
    }

    public void buscarMayor() {
        mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
    }

    public void llenarArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarNumAleatorio(1, 50);
        }
    }

    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
    }
}
