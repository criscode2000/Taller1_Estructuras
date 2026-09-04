import java.util.Scanner;
public class EJ31 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Bloque 3: Estructuras repetitivas
Los siguientes ejercicios requieren el uso de ciclos for y while para repetir instrucciones un número determinado o indeterminado de veces.

Ejercicio 3.1 — Tabla de multiplicar extendida (for)

Escribe un programa que lea un número entero positivo n e imprima su tabla de multiplicar del 1 al 12 con formato alineado. Luego, usando un segundo ciclo for anidado, imprime las tablas de multiplicar de todos los números del 1 hasta n en formato de cuadrícula.

Ejemplo para n = 3:

  1   2   3   4   5   6   7   8   9  10  11  12
  2   4   6   8  10  12  14  16  18  20  22  24
  3   6   9  12  15  18  21  24  27  30  33  36 */
        
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();
        
        System.out.println("Tabla de multiplicar del 1 al 12:");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", n * i);
        }
        System.out.println();
        
        System.out.println("Tablas de multiplicar del 1 hasta " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        sc.close();
    }
}