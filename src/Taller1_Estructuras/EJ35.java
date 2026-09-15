import java.util.Scanner;
public class EJ35 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*Números primos en un rango (for y while)

Escribe un programa que lea dos números enteros positivos a y b (donde a < b) e imprima todos los números primos en ese rango, separados por comas. Al final, indica cuántos primos se encontraron y cuál es su suma.

Para determinar si un número es primo, usa un ciclo while interno que verifique si tiene divisores entre 2 y la raíz cuadrada del número (Math.sqrt()).

Ejemplo para a = 10, b = 30:

Primos entre 10 y 30: 11, 13, 17, 19, 23, 29
Cantidad: 6
Suma: 112  */

        int a, b;
        do {
            System.out.print("Ingrese un número entero positivo a: ");
            a = sc.nextInt();
            System.out.print("Ingrese un número entero positivo b (mayor que a): ");
            b = sc.nextInt();
            if (a <= 0 || b <= 0 || a >= b) {
                System.out.println("Error: Asegúrese de que a y b sean positivos y que a < b. Intente nuevamente.");
            }
        } while (a <= 0 || b <= 0 || a >= b);
        
        int cantidadPrimos = 0;
        int sumaPrimos = 0;
        StringBuilder primos = new StringBuilder();
        
        for (int num = a; num <= b; num++) {
            if (esPrimo(num)) {
                if (cantidadPrimos > 0) {
                    primos.append(", ");
                }
                primos.append(num);
                cantidadPrimos++;
                sumaPrimos += num;
            }
        }
        
        System.out.println("Primos entre " + a + " y " + b + ": " + primos.toString());
        System.out.println("Cantidad: " + cantidadPrimos);
        System.out.println("Suma: " + sumaPrimos);
        
        sc.close();
    }
}