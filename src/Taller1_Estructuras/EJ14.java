import java.util.Scanner;
public class EJ14 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Tiempo de viaje

Una aplicación de transporte muestra el tiempo estimado de viaje en un formato legible.

Escribe un programa que lea una cantidad de minutos totales (número entero) e imprima cuántas horas, minutos y segundos equivalen, sabiendo que el tiempo real en segundos es minutos × 60.

Ejemplo para 150 minutos:

Tiempo ingresado: 150 minutos
Equivale a:       2 horas, 30 minutos, 0 segundos
En segundos:      9000 segundos
Pista: usa el operador % (módulo) y la división entera para separar horas y minutos. */
        
        System.out.print("Ingrese la cantidad de minutos totales: ");
        int minutosTotales = sc.nextInt();
        
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        int segundos = minutosTotales * 60;
        
        System.out.printf("Tiempo ingresado: %d minutos%n", minutosTotales);
        System.out.printf("Equivale a:       %d horas, %d minutos, %d segundos%n", horas, minutos, 0);
        System.out.printf("En segundos:      %d segundos%n", segundos);
        
        sc.close();
        
    }
}