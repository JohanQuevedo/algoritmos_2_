
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        switch (numero >= 0 ? (numero % 2 == 0 ? 1 : 2) : (numero % 2 == 0 ? 3 : 4)) {
            case 1:
                System.out.println("El numero es positivo y par.");
                break;
            case 2:
                System.out.println("El numero es positivo e impar.");
                break;
            case 3:
                System.out.println("El numero es negativo y par.");
                break;
            case 4:
                System.out.println("El numero es negativo e impar.");
                break;
            default:
                System.out.println("El numero es positivo.");
        }
    }
}

