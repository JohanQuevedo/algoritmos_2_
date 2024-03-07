import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.print("Ingrese el precio por hora: ");
        double precioHora = scanner.nextDouble();
        
        double salarioBruto;
        
        if (horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * precioHora;
        } else {
            int horasNormales = 35;
            int horasExtras = horasTrabajadas - horasNormales;
            salarioBruto = (horasNormales * precioHora) + (horasExtras * precioHora * 1.5);
        }
        
        double impuestos;
        if (salarioBruto < 600) {
            impuestos = 0;
        } else if (salarioBruto >= 600 && salarioBruto <= 1000) {
            impuestos = salarioBruto * 0.2;
        } else {
            impuestos = salarioBruto * 0.3;
        }
        
        double salarioNeto = salarioBruto - impuestos;
        
        System.out.println("El salario neto del trabajador es: " + salarioNeto);
        
        scanner.close();
    }
}
