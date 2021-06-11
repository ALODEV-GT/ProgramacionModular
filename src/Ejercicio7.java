package src;

public class Ejercicio7 {
    
    int elementos[][] = new int[4][3];


    public Ejercicio7(){
        llenarMatriz();
        mostrarMatriz();
        sumarNumerosFilaPar();

    }

    public void mostrarMatriz() {
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                System.out.print(elementos[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void llenarMatriz(){
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                elementos[i][j] = generarNumAleatorio(0, 555);
            }
        }
    }
    
    public int generarNumAleatorio(int inicio, int fin) {
        int numero;
        numero = (int) (inicio + Math.random() * (fin - inicio + 1));
        return numero;
    }

    public void sumarNumerosFilaPar(){
        int suma = 0;
        for (int i = 0; i < elementos.length; i++) {
            if((i+1) % 2 == 0){
                for (int j = 0; j < elementos[i].length; j++) {
                    suma+=elementos[i][j];
                }
            }
        }
        System.out.println("La suma de los numeros en las filas pares es: " + suma);
    }

    public static void main(String[] args) {
        Ejercicio7 ejercicio = new Ejercicio7();
    }
}
