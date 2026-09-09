import java.util.Scanner;
public class EJ34 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Validación de entrada con while

En sistemas de registro es importante asegurar que el usuario ingrese datos dentro de un rango válido antes de continuar.

Escribe un programa que solicite repetidamente al usuario que ingrese su edad (número entero) hasta que ingrese un valor entre 1 y 120. Mientras el valor sea inválido, imprime un mensaje de error descriptivo y vuelve a pedir el dato. Una vez recibido un valor válido, clasifica la persona según su etapa de vida:

Rango	Etapa
1 a 12	Niñez
13 a 17	Adolescencia
18 a 25	Juventud
26 a 59	Adultez
60 o más	Tercera edad */

        int edad;
        while (true) {
            System.out.print("Ingrese su edad (1-120): ");
            edad = sc.nextInt();
            if (edad >= 1 && edad <= 120) {
                break; // Salir del bucle si la edad es válida
            } else {
                System.out.println("Error: La edad debe estar entre 1 y 120. Intente nuevamente.");
            }
        }
        
        // Clasificación según la etapa de vida
        if (edad >= 1 && edad <= 12) {
            System.out.println("Etapa de vida: Niñez");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Etapa de vida: Adolescencia");
        } else if (edad >= 18 && edad <= 25) {
            System.out.println("Etapa de vida: Juventud");
        } else if (edad >= 26 && edad <= 59) {
            System.out.println("Etapa de vida: Adultez");
        } else { // edad >= 60
            System.out.println("Etapa de vida: Tercera edad");
        }
        
        sc.close();
    }
}