import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int primerValor = scanner.nextInt();
        
        if (primerValor > 0) {
            System.out.print("Ingrese el segundo valor: ");
            int segundoValor = scanner.nextInt();
            
            int suma = primerValor + segundoValor;
            int resta = primerValor - segundoValor;
            int producto = primerValor * segundoValor;
            
            System.out.println("La suma de los valores es: " + suma);
            System.out.println("La resta de los valores es: " + resta);
            System.out.println("El producto de los valores es: " + producto);
        } else {
            System.out.println("El primer valor no es positivo. No se pueden realizar operaciones.");
        }
        
        scanner.close();
    }
}
