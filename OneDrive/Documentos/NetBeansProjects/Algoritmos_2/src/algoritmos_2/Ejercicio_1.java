package algoritmos_2;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero del 1 al 7");
        int dia = leer.nextInt();
        if (dia==1){
            System.out.println("El día es lunes");
        }
        else if (dia==2){System.out.println("El dia es Martes");
        } 
        else if (dia==3){System.out.println("El dia es Miercoles");
        }
        else if (dia==4) {System.out.println("El dia es Jueves");
        }
        else if (dia==5) {System.out.println("El dia es Viernes");
        } 
        else if (dia==6) {System.out.println("El dia Sabado");
        }
        else if (dia==7) {System.out.println("El dia es Domingo");
        }
        else if (dia==8) {System.out.println("Numero no es valido");
        }
    }    
}
