import java.util.Scanner;
public class EJ12 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /* Una empresa de mensajería paga a sus empleados según las horas trabajadas en la semana. Sobre el salario bruto se descuenta un porcentaje fijo de seguridad social (8%) y otro de retención en la fuente (5%).

Escribe un programa que lea el nombre del empleado, las horas trabajadas en la semana y el valor de la hora. Calcula e imprime el salario bruto, los dos descuentos por separado y el salario neto final.

Ejemplo de salida esperada:

Empleado:           Laura Torres
Horas trabajadas:   42
Salario bruto:      $ 630000.00
Descuento SS (8%):  $  50400.00
Retención (5%):     $  31500.00
Salario neto:       $ 548100.00 */

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horasTrabajadas = sc.nextDouble();
        
        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = sc.nextDouble();
        
        double salarioBruto = horasTrabajadas * valorHora;
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSS - retencion;
        
        System.out.printf("Empleado:           %s%n", nombre);
        System.out.printf("Horas trabajadas:   %.2f%n", horasTrabajadas);
        System.out.printf("Salario bruto:      $ %.2f%n", salarioBruto);
        System.out.printf("Descuento SS (8%%):  $ %.2f%n", descuentoSS);
        System.out.printf("Retención (5%%):     $ %.2f%n", retencion);
        System.out.printf("Salario neto:       $ %.2f%n", salarioNeto);
        
        sc.close();
    }
}