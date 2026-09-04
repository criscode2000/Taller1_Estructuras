import java.util.Scanner;
public class EJ25 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*  Año bisiesto y día de la semana

Escribe un programa que lea un año (número entero positivo) y determine si es bisiesto o no. Adicionalmente, lee un número del 1 al 7 y lo convierte al nombre del día de la semana correspondiente (1 = lunes, 7 = domingo). Si el número está fuera del rango, muestra un mensaje de error.

Un año es bisiesto si:

Es divisible entre 4, y
No es divisible entre 100, excepto si también es divisible entre 400. */

        System.out.print("Ingrese un año (número entero positivo): ");
        int anio = sc.nextInt();
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        String resultadoBisiesto = esBisiesto ? "El año " + anio + " es bisiesto." : "El año " + anio + " no es bisiesto.";
        System.out.println(resultadoBisiesto);
        
        System.out.print("Ingrese un número del 1 al 7 para el día de la semana: ");
        int diaNumero = sc.nextInt();
        
        String diaSemana;
        switch (diaNumero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número fuera de rango. Debe ser entre 1 y 7.";
        }
        
        System.out.println("Día de la semana: " + diaSemana);
        
        sc.close();
    }
}