package src;
import java.util.Scanner;
public class Ejercicio1{

    public static void main(String[] args){
        Ejercicio1 ejercicio = new Ejercicio1();
    }
    
    Scanner entrada = new Scanner(System.in);
    int[] elementos = new int[5];

    public Ejercicio1(){
        ingresarDatos();
        mostrarDatos();
    }

    public void ingresarDatos(){
        for(int i = 0; i < elementos.length; i++){
            pedirDato(i);
        }
    }

    public void mostrarDatos(){
        for(int i = 0; i < elementos.length; i++){
            mostrarDato(i);
        }
    }

    public void pedirDato(int indice){
        System.out.println("Ingrese el elemento " + indice + ": ");
        elementos[indice] = entrada.nextInt();
    }

    public void mostrarDato(int indice){
        System.out.println("elemento en la posicion " + indice + " = " + elementos[indice]);
    }
 
}