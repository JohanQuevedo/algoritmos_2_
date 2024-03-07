
package algoritmos_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("ingrese un dia de la semana ");
        Scanner leer = new Scanner(System.in);
        int dia = leer.nextInt();
        switch(dia){
            case 1:
                System.out.println("dia Lunes");
                break;
            case 2:
                System.out.println("dia Martes");
                break;
            case 3:
                System.out.println("dia Miercoles");
                break;
            case 4:
                System.out.println("dia Jueves");
                break;
            case 5:
                System.out.println("dia Viernes");
                break;
            case 6:
                System.out.println("dia Sabado");
                break;
            case 7: 
                System.out.println("dia Domingo");
                break;
            default: 
            System.out.println("no es un dia de la semana ");
            
        }
                
                
    }
}
