import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de minutos de la llamada: ");
        int minutos = scanner.nextInt();
        
        int costoTotal;
        if (minutos <= 5) {
            costoTotal = 500;
        } else {
            int minutosExtras = minutos - 5;
            costoTotal = 500 + minutosExtras * 100;
        }
        
        System.out.println("El costo total de la llamada es: " + costoTotal);
        
        scanner.close();
    }
}

