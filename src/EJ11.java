import java.util.Scanner;
public class EJ11 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
/*  Ejercicio 1.1 — Conversión de temperatura

Un laboratorio registra temperaturas en grados Celsius y necesita convertirlas a Fahrenheit y a Kelvin para sus reportes internacionales.

Escribe un programa que lea una temperatura en grados Celsius e imprima su equivalente en Fahrenheit y en Kelvin, con dos decimales de precisión.

Fórmulas:

F = (C × 9/5) + 32
K = C + 273.15
Ejemplo de salida esperada para C = 25:

Celsius:    25.00 °C
Fahrenheit: 77.00 °F
Kelvin:     298.15 K */


        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.printf("Celsius:    %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K%n", kelvin);
        
        sc.close();
    }
}
