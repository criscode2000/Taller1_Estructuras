import java.util.Scanner;
public class EJ44 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Ejercicio 4.4 — Registro de ventas por sucursal (matriz)

Una cadena de tiendas tiene 4 sucursales y registra las ventas de 3 productos distintos en cada una. Los datos se almacenan en una matriz de 4 filas (sucursales) y 3 columnas (productos).

Escribe un programa que llene la matriz con los valores de ventas ingresados por el usuario. Luego calcula e imprime:

El total de ventas por sucursal (suma de cada fila).
El total de ventas por producto (suma de cada columna).
La venta más alta de toda la matriz, indicando en qué sucursal y qué producto corresponde.
Formato de salida sugerido:

--- Ventas por sucursal ---
Sucursal 1: $ 1500000
Sucursal 2: $ 2300000
...

--- Ventas por producto ---
Producto 1: $ 1800000
...

Venta más alta: $ 950000 (Sucursal 2, Producto 3) */
            
        int[][] ventas = new int[4][3];
        
        // Llenar la matriz con los valores de ventas
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese las ventas de la Sucursal " + (i + 1) + ", Producto " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }
        
        // Calcular y mostrar el total de ventas por sucursal
        System.out.println("\n--- Ventas por sucursal ---");
        for (int i = 0; i < ventas.length; i++) {
            int totalSucursal = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                totalSucursal += ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": $ " + totalSucursal);
        }
        
        // Calcular y mostrar el total de ventas por producto
        System.out.println("\n--- Ventas por producto ---");
        for (int j = 0; j < ventas[0].length; j++) {
            int totalProducto = 0;
            for (int i = 0; i < ventas.length; i++) {
                totalProducto += ventas[i][j];
            }
            System.out.println("Producto " + (j + 1) + ": $ " + totalProducto);
        }
        
        // Encontrar la venta más alta y su ubicación
        int ventaMaxima = Integer.MIN_VALUE;
        int sucursalMaxima = -1;
        int productoMaximo = -1;
        
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > ventaMaxima) {
                    ventaMaxima = ventas[i][j];
                    sucursalMaxima = i;
                    productoMaximo = j;
                }
            }
        }
        
        System.out.println("\nVenta más alta: $ " + ventaMaxima + " (Sucursal " + (sucursalMaxima + 1) + ", Producto " + (productoMaximo + 1) + ")");
    }
}