import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();
        
        System.out.println("Seleccione la unidad de temperatura:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Seleccione la unidad a la que desea convertir:");
                System.out.println("1. Fahrenheit");
                System.out.println("2. Kelvin");
                int conversionCelsius = scanner.nextInt();
                
                switch (conversionCelsius) {
                    case 1:
                        double fahrenheit = (temperatura * 9 / 5) + 32;
                        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                        break;
                    case 2:
                        double kelvin = temperatura + 273.15;
                        System.out.println("La temperatura en Kelvin es: " + kelvin);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break;
            case 2:
                System.out.println("Seleccione la unidad a la que desea convertir:");
                System.out.println("1. Celsius");
                System.out.println("2. Kelvin");
                int conversionFahrenheit = scanner.nextInt();
                
                switch (conversionFahrenheit) {
                    case 1:
                        double celsius = (temperatura - 32) * 5 / 9;
                        System.out.println("La temperatura en Celsius es: " + celsius);
                        break;
                    case 2:
                        double kelvin = (temperatura + 459.67) * 5 / 9;
                        System.out.println("La temperatura en Kelvin es: " + kelvin);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break;
            case 3:
                System.out.println("Seleccione la unidad a la que desea convertir:");
                System.out.println("1. Celsius");
                System.out.println("2. Fahrenheit");
                int conversionKelvin = scanner.nextInt();
                
                switch (conversionKelvin) {
                    case 1:
                        double celsius = temperatura - 273.15;
                        System.out.println("La temperatura en Celsius es: " + celsius);
                        break;
                    case 2:
                        double fahrenheit = (temperatura * 9 / 5) - 459.67;
                        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}