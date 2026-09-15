import java.util.Scanner;
public class EJ15 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Promedio ponderado de un estudiante

Un sistema académico calcula la nota definitiva de una materia con tres componentes evaluativos con pesos distintos: el primer parcial vale el 30%, el segundo parcial el 30%, y el examen final el 40%.

Escribe un programa que lea las tres notas del estudiante (valores entre 0.0 y 5.0) y calcule e imprima la nota definitiva con dos decimales. Indica además si el estudiante aprueba (nota mayor o igual a 3.0) o reprueba, sin usar estructuras condicionales (if): representa el resultado como un mensaje construido con un operador ternario o como simple texto calculado. */
  
        System.out.print("Ingrese la nota del primer parcial (0.0 - 5.0): ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Ingrese la nota del segundo parcial (0.0 - 5.0): ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Ingrese la nota del examen final (0.0 - 5.0): ");
        double notaFinal = sc.nextDouble();
        
        double notaDefinitiva = (nota1 * 0.3) + (nota2 * 0.3) + (notaFinal * 0.4);
        
        String resultado = (notaDefinitiva >= 3.0) ? "Aprobado" : "Reprobado";
        
        System.out.printf("Nota definitiva: %.2f%n", notaDefinitiva);
        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}