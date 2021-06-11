package src;

import java.util.Scanner;

public class Ejercicio12 {
    Scanner entrada = new Scanner(System.in);

    String[] descripcionNota = new String[5];
    String[] nombres = new String[5];
    double[] notas = new double[5];

    public Ejercicio12() {
        pedirDatos();
        mostrarDatosAlumnos();
    }

    public void mostrarDatosAlumnos() {
        for (int i = 0; i < nombres.length; i++) {
            System.out
                    .println("Nombre: " + nombres[i] + ", Nota: " + notas[i] + ", Descripcion: " + descripcionNota[i]);
        }
    }

    public void pedirDatos() {
        for (int i = 0; i < descripcionNota.length; i++) {
            ingresarNombre(i);
            ingresarDescripcionNota(i);
            ingresarNota(i);
        }
    }

    public void ingresarDescripcionNota(int indice) {
        boolean desCorrecta = false;
        do {
            System.out.println("Ingrese la descripcion de la nota (Sobresaliente, Notable, Bien, Suspenso) alumno "
                    + (indice + 1));
            descripcionNota[indice] = entrada.next();

            if (descripcionNota[indice].equalsIgnoreCase("Suspenso") || descripcionNota[indice].equalsIgnoreCase("Bien")
                    || descripcionNota[indice].equalsIgnoreCase("Notable")
                    || descripcionNota[indice].equalsIgnoreCase("Sobresaliente")) {
                desCorrecta = true;
            } else {
                System.out.println("La descripcion que ingresaste no existe");
            }
        } while (!desCorrecta);
    }

    public void ingresarNombre(int indice) {
        System.out.println("Ingrese nombre del alumno " + (indice + 1));
        nombres[indice] = entrada.next();
    }

    public void ingresarNota(int indice) {
        boolean correcto = false;
        do {
            System.out.println("Ingrese la nota del alumno " + (indice + 1));
            notas[indice] = entrada.nextDouble();

            if (descripcionNota[indice].equalsIgnoreCase("Suspenso")) {
                if (notas[indice] >= 0 && notas[indice] <= 4.99) {
                    correcto = true;
                } else {
                    System.out.println("La nota que ingresaste no corresponde a la descripcion");
                }
            } else if (descripcionNota[indice].equalsIgnoreCase("Bien")) {
                if (notas[indice] >= 5 && notas[indice] <= 6.99) {
                    correcto = true;
                } else {
                    System.out.println("La nota que ingresaste no corresponde a la descripcion");
                }
            } else if (descripcionNota[indice].equalsIgnoreCase("Notable")) {
                if (notas[indice] >= 7 && notas[indice] <= 8.99) {
                    correcto = true;
                } else {
                    System.out.println("La nota que ingresaste no corresponde a la descripcion");
                }
            } else {
                if (notas[indice] >= 9 && notas[indice] <= 10) {
                    correcto = true;
                } else {
                    System.out.println("La nota que ingresaste no corresponde a la descripcion");
                }
            }

        } while (!correcto);
    }

    public static void main(String[] args) {
        Ejercicio12 ejercicio = new Ejercicio12();
    }
}
