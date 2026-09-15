import java.util.Scanner;
public class EJ45 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Ejercicio 4.5 — Tablero de tres en raya (matriz)

Implementa el juego tres en raya (tic-tac-toe) para dos jugadores en consola.

Usa una matriz de 3 × 3 de tipo char, inicializada con espacios en blanco. Los jugadores se turnan: el jugador 1 usa 'X' y el jugador 2 usa 'O'. En cada turno, el jugador activo ingresa la fila y la columna donde quiere marcar (valores entre 0 y 2). El programa debe:

Validar que la celda elegida esté vacía; si no, pedir otro turno.
Mostrar el tablero actualizado después de cada jugada.
Verificar si algún jugador ganó (fila completa, columna completa o diagonal completa).
Detectar empate si el tablero se llena sin ganador.
Anunciar el resultado final.
Ejemplo de tablero en pantalla:

 X | O | X
-----------
   | X | O
-----------
 O |   | X
 */
        
        char[][] tablero = new char[3][3];
        
        // Inicializar el tablero con espacios en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        
        int turno = 1; // 1 para jugador 1 (X), 2 para jugador 2 (O)
        boolean juegoTerminado = false;
        
        while (!juegoTerminado) {
            // Mostrar el tablero
            System.out.println("\nTablero actual:");
            for (int i = 0; i < 3; i++) {
                System.out.print(" ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) System.out.print(" | ");
                }
                System.out.println();
                if (i < 2) System.out.println("-----------");
            }
            
            // Solicitar la jugada del jugador activo
            char simbolo = (turno == 1) ? 'X' : 'O';
            int fila, columna;
            do {
                System.out.print("\nJugador " + turno + " (" + simbolo + "), ingrese fila (0-2): ");
                fila = sc.nextInt();
                System.out.print("Jugador " + turno + " (" + simbolo + "), ingrese columna (0-2): ");
                columna = sc.nextInt();
                
                if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ') {
                    System.out.println("Movimiento inválido. Intente nuevamente.");
                    fila = -1; // Forzar repetición del bucle
                }
            } while (fila == -1);
            
            // Colocar el símbolo en el tablero
            tablero[fila][columna] = simbolo;
            
            // Verificar si hay un ganador o empate
            juegoTerminado = verificarGanador(tablero, simbolo);
            if (!juegoTerminado && verificarEmpate(tablero)) {
                juegoTerminado = true;
                System.out.println("\n¡Empate! El tablero está lleno.");
            } else if (!juegoTerminado) {
    }
}