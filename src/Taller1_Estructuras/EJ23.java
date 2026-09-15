import java.util.Scanner;
public class EJ23 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /* Sistema de calificaciones con letras

Una universidad utiliza un sistema de notas con letras para sus reportes externos.

Escribe un programa que lea la nota numérica de un estudiante (entre 0.0 y 5.0) y la convierta a su equivalente en letra según la siguiente escala:

Rango	Letra	Descripción
4.6 a 5.0	A	Excelente
4.0 a 4.5	B	Sobresaliente
3.5 a 3.9	C	Aceptable
3.0 a 3.4	D	Aprobado mínimo
Menor de 3.0	F	Reprobado
 */

        System.out.print("Ingrese la nota numérica del estudiante (0.0 - 5.0): ");
        double nota = sc.nextDouble();
        
        String letra;
        String descripcion;
        
        if (nota >= 4.6 && nota <= 5.0) {
            letra = "A";
            descripcion = "Excelente";
        } else if (nota >= 4.0 && nota < 4.6) {
            letra = "B";
            descripcion = "Sobresaliente";
        } else if (nota >= 3.5 && nota < 4.0) {
            letra = "C";
            descripcion = "Aceptable";
        } else if (nota >= 3.0 && nota < 3.5) {
            letra = "D";
            descripcion = "Aprobado mínimo";
        } else {
            letra = "F";
            descripcion = "Reprobado";
        }
        
        System.out.printf("Nota numérica: %.2f%n", nota);
        System.out.printf("Equivalente en letra: %s%n", letra);
        System.out.printf("Descripción: %s%n", descripcion);
        
        sc.close();
    }
}