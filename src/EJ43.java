import java.util.Scanner;
public class EJ43 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Ejercicio 4.3 — Búsqueda en arreglo de nombres

Una clínica maneja un listado de pacientes registrados. El sistema debe permitir verificar si un paciente ya está en la base de datos.

Escribe un programa que llene un arreglo de 8 nombres (tipo String) ingresados por el usuario. Luego pide un nombre a buscar y recorre el arreglo para determinar si el nombre existe. Si lo encuentra, imprime en qué posición está; si no, informa que no fue encontrado. La búsqueda debe ser insensible a mayúsculas (usa .equalsIgnoreCase()). */
 
    
        String[] pacientes = new String[8];
        
        // Llenar el arreglo de nombres
        for (int i = 0; i < pacientes.length; i++) {
            System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }
        
        // Pedir un nombre a buscar
        System.out.print("Ingrese el nombre del paciente a buscar: ");
        String nombreBuscar = sc.nextLine();
        
        // Buscar el nombre en el arreglo
        boolean encontrado = false;
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Paciente encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Paciente no encontrado.");
        }
        
        sc.close();
    }
}