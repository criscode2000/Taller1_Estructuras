import java.util.Scanner;
public class EJ32 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*   Adivina el número (while)

Escribe un programa que genere un número entero aleatorio entre 1 y 100 (usa (int)(Math.random() * 100) + 1) y le pida al usuario que lo adivine. Con cada intento, el programa indica si el número secreto es mayor o menor que el ingresado. El ciclo continúa hasta que el usuario acierte. Al final, muestra cuántos intentos necesitó.

Ejemplo de ejecución parcial:

Adivina el número (entre 1 y 100):
Intento 1: 50 → El número es mayor.
Intento 2: 75 → El número es menor.
Intento 3: 63 → ¡Correcto! Lo lograste en 3 intentos. */
    System.out.println("Adivina el número (entre 1 y 100):");
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intentos = 0;
        int adivinanza = 0;
        
        while (adivinanza != numeroSecreto) {
            intentos++;
            System.out.print("Intento " + intentos + ": ");
            adivinanza = sc.nextInt();
            
            if (adivinanza < numeroSecreto) {
                System.out.println("→ El número es mayor.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("→ El número es menor.");
            } else {
                System.out.println("→ ¡Correcto! Lo lograste en " + intentos + " intentos.");
            }
        }
        
        sc.close();        

       
    }
}