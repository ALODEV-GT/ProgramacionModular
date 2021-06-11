package src;

public class Ejercicio6 {

    int[][] matriz = { { 5, 6, 13 }, { 14, 2, 4 }, { 21, 7, 6 } };

    public Ejercicio6() {
        mostrarMatriz();
        duplicarValoresMatriz();
        mostrarMatriz();
    }

    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void duplicarValoresMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] *= 2;
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Ejercicio6 ejercicio = new Ejercicio6();
    }
}
