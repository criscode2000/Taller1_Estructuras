import java.util.Scanner;
public class EJ33 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Suma de series matemáticas (for)

Escribe un programa que calcule e imprima las siguientes tres series, cada una hasta el término n que el usuario ingrese:

Suma de los primeros n números naturales: 1 + 2 + 3 + ... + n
Suma de los primeros n números pares: 2 + 4 + 6 + ... + 2n
Suma de los primeros n cuadrados perfectos: 1 + 4 + 9 + ... + n²
Para cada serie, imprime también la fórmula cerrada y verifica que el resultado del ciclo coincida con ella.*/
        
        System.out.print("Ingrese un número entero positivo n: ");
        int n = sc.nextInt();
        
        // Suma de los primeros n números naturales
        int sumaNaturales = 0;
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
        }
        int formulaNaturales = n * (n + 1) / 2;
        System.out.println("Suma de los primeros " + n + " números naturales: " + sumaNaturales);
        System.out.println("Fórmula cerrada: " + formulaNaturales);
        
        // Suma de los primeros n números pares
        int sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += 2 * i;
        }
        int formulaPares = n * (n + 1);
        System.out.println("Suma de los primeros " + n + " números pares: " + sumaPares);
        System.out.println("Fórmula cerrada: " + formulaPares);
        
        // Suma de los primeros n cuadrados perfectos
        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += i * i;
        }
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("Suma de los primeros " + n + " cuadrados perfectos: " + sumaCuadrados);
        System.out.println("Fórmula cerrada: " + formulaCuadrados);
        
        sc.close();
        
    }
}