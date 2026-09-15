import java.util.Scanner;
public class EJ21 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Clasificación de triángulos

Escribe un programa que lea las longitudes de tres lados de un triángulo (números reales positivos). El programa debe:

Verificar si los tres lados forman un triángulo válido (la suma de cualquier par de lados debe ser mayor que el tercer lado).
Si es válido, clasificarlo como:
Equilátero: los tres lados son iguales.
Isósceles: exactamente dos lados son iguales.
Escaleno: los tres lados son diferentes.
Si no es válido, informar al usuario. */
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = sc.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: "); 
        double lado2 = sc.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = sc.nextDouble();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }
        sc.close();
    }
}