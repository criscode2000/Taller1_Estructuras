import java.util.Scanner;
public class EJ41 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Bloque 4: Arreglos y matrices
Los siguientes ejercicios requieren declarar, llenar y recorrer arreglos unidimensionales y bidimensionales.

Ejercicio 4.1 — Estadísticas de un grupo

Un docente registra las notas de 10 estudiantes en un arreglo.

Escribe un programa que llene un arreglo de 10 notas (valores entre 0.0 y 5.0) ingresadas por el usuario. Luego calcula e imprime:

El promedio del grupo.
La nota más alta y la posición (índice) donde se encuentra.
La nota más baja y la posición (índice) donde se encuentra.
Cuántos estudiantes aprobaron (nota mayor o igual a 3.0) y cuántos reprobaron. */

        double[] notas = new double[10];
        double suma = 0.0;
        double notaMaxima = Double.MIN_VALUE;
        double notaMinima = Double.MAX_VALUE;
        int indiceMaximo = -1;
        int indiceMinimo = -1;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0.0 - 5.0): ");
            notas[i] = sc.nextDouble();
            while (notas[i] < 0.0 || notas[i] > 5.0) {
                System.out.println("Error: La nota debe estar entre 0.0 y 5.0. Intente nuevamente.");
                System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0.0 - 5.0): ");
                notas[i] = sc.nextDouble();
            }
            suma += notas[i];

            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
                indiceMaximo = i;
            }
            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
                indiceMinimo = i;
            }
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Promedio del grupo: " + promedio);
        System.out.println("Nota más alta: " + notaMaxima + " en la posición: " + indiceMaximo);
        System.out.println("Nota más baja: " + notaMinima + " en la posición: " + indiceMinimo);
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
        System.out.println("Cantidad de estudiantes reprobados: " + reprobados);

        sc.close();
    }
}