import java.util.Scanner;
public class EJ24 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*Tarifa de parqueadero

Un centro comercial cobra el parqueadero según el tipo de vehículo y las horas de permanencia:

Tipo	Primera hora	Hora adicional
Moto	$ 2.000	$ 1.500
Carro	$ 4.000	$ 3.000
Camioneta	$ 5.000	$ 4.000
Escribe un programa que lea el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta) y el número de horas de permanencia (entero mayor a 0). Calcula e imprime el valor total a pagar. Si se ingresa un tipo de vehículo diferente a 1, 2 o 3, informa que la opción no es válida. Usa switch para la selección del tipo de vehículo. */
    
    
        System.out.print("Ingrese el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta): ");
        int tipoVehiculo = sc.nextInt();
        
        System.out.print("Ingrese el número de horas de permanencia (entero mayor a 0): ");
        int horasPermanencia = sc.nextInt();
        
        if (horasPermanencia <= 0) {
            System.out.println("El número de horas debe ser mayor a 0.");
            sc.close();
            return;
        }
        
        double tarifaTotal = 0.0;
        
        switch (tipoVehiculo) {
            case 1: // Moto
                tarifaTotal = 2000 + (horasPermanencia - 1) * 1500;
                break;
            case 2: // Carro
                tarifaTotal = 4000 + (horasPermanencia - 1) * 3000;
                break;
            case 3: // Camioneta
                tarifaTotal = 5000 + (horasPermanencia - 1) * 4000;
                break;
            default:
                System.out.println("Opción no válida.");
                sc.close();
                return;
        }
        
        System.out.printf("Valor total a pagar: $ %.2f%n", tarifaTotal);
        
        sc.close();
    }
}