import java.util.Scanner;
public class EJ42 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Inversión de un arreglo

Escribe un programa que llene un arreglo de n números enteros (donde n es ingresado por el usuario, máximo 20). Luego invierte el arreglo sin usar un segundo arreglo auxiliar (intercambia los elementos directamente dentro del mismo arreglo) e imprime el arreglo original y el invertido.

Ejemplo para n = 5 con valores {3, 7, 1, 9, 4}:

Original:  3  7  1  9  4
Invertido: 4  9  1  7  3
Pista: usa un solo ciclo que intercambie el elemento de la posición i con el de la posición n - 1 - i, hasta llegar a la mitad del arreglo.

 */
        
        System.out.print("Ingrese la cantidad de números (máximo 20): ");
        int n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.println("Error: La cantidad debe estar entre 1 y 20. Intente nuevamente.");
            System.out.print("Ingrese la cantidad de números (máximo 20): ");
            n = sc.nextInt();
        }
        
        int[] arreglo = new int[n];
        
        // Llenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        
        // Imprimir arreglo original
        System.out.print("Original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Invertir el arreglo
        for (int i = 0; i < n / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temp;
        }
        
        // Imprimir arreglo invertido
        System.out.print("Invertido: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}