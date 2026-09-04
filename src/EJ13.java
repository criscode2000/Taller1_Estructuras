import java.util.Scanner;
public class EJ13 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Área y perímetro de figuras

Un estudiante de arquitectura necesita una herramienta rápida para calcular medidas básicas de figuras planas.

Escribe un programa que lea la base y la altura de un rectángulo, y el radio de un círculo. Calcula e imprime el área y el perímetro del rectángulo, y el área y la circunferencia del círculo. Usa Math.PI para el valor de pi.

Fórmulas:

Rectángulo: área = base × altura, perímetro = 2 × (base + altura)
Círculo: área = π × r², circunferencia = 2 × π × r */

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        
        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);
        
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferenciaCirculo = 2 * Math.PI * radio;
        
        System.out.printf("Área del rectángulo: %.2f%n", areaRectangulo);
        System.out.printf("Perímetro del rectángulo: %.2f%n", perimetroRectangulo);
        System.out.printf("Área del círculo: %.2f%n", areaCirculo);
        System.out.printf("Circunferencia del círculo: %.2f%n", circunferenciaCirculo);
        
        sc.close();
    }
}