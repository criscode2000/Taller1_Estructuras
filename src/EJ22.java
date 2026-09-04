import java.util.Scanner;
public class EJ22 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*Calculadora de índice de masa corporal (IMC)

El IMC es un indicador de salud que relaciona el peso y la talla de una persona.

Escribe un programa que lea el peso en kilogramos y la estatura en metros de una persona. Calcula el IMC con la fórmula IMC = peso / estatura² e imprime la categoría según la siguiente clasificación:

Rango IMC	Categoría
Menor de 18.5	Bajo peso
18.5 a 24.9	Peso normal
25.0 a 29.9	Sobrepeso
30.0 o más	Obesidad    */
        
        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = sc.nextDouble();
        
        System.out.print("Ingrese la estatura en metros: ");
        double estatura = sc.nextDouble();
        
        double imc = peso / Math.pow(estatura, 2);
        String categoria;
        
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25.0) {
            categoria = "Peso normal";
        } else if (imc < 30.0) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }
        
        System.out.printf("IMC: %.2f%n", imc);
        System.out.printf("Categoría: %s%n", categoria);
        
        sc.close();
    }
}