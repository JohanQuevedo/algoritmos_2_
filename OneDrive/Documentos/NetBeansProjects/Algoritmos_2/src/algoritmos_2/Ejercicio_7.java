import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio de costo del articulo: ");
        double precioCosto = scanner.nextDouble();
        
        double ganancia;
        if (precioCosto < 10000) {
            ganancia = precioCosto * 0.15;
        } else if (precioCosto >= 10000 && precioCosto <= 50000) {
            ganancia = 5000;
        } else {
            ganancia = precioCosto * 0.25;
        }
        
        double precioVenta = precioCosto + ganancia;
        
        System.out.println("El precio de venta del arti1culo es: " + precioVenta);
        
        scanner.close();
    }
}
