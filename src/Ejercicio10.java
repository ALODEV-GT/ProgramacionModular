package src;

public class Ejercicio10 {

    int[][] matriz = new int[3][4];
    int[][] matirzTraspuesta = new int[4][3];

    public Ejercicio10(){
        llenarMatriz();
        System.out.println("Matriz: ");
        mostrarMatriz(matriz);
        System.out.println("Matriz transpuesta: ");
        realizarMatrizTraspuesta();
        mostrarMatriz(matirzTraspuesta);
    }

    public void realizarMatrizTraspuesta(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matirzTraspuesta.length; j++) {
                matirzTraspuesta[j][i] = matriz[i][j];
               }
        }
    }

    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    public void llenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumAleatorio(1, 9);
            }
        }
    }

    public void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ejercicio10 ejercicio = new Ejercicio10();
    }
}
