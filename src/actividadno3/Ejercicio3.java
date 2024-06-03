package actividadno3;

import java.util.Scanner;

/*Hacer un programa en Java que, dado un rango, por el usuario,
*se da número inicial y uno final 
*(tomar en cuenta que el inicial debe ser menor que el final, 
*hacer la validación y volver a pedir los dos números si no cumple la condición)
*y sume los números pares dentro del rango incluyendo el valor inicial y final.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int rangoInicial;
        int rangoFinal;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("De un valor inicial");
            rangoInicial = leer.nextInt();
            System.out.println("De el valor final");
            rangoFinal = leer.nextInt();

            if(rangoInicial<rangoFinal){  
                
            }while(rangoInicial < rangoFinal);
        }
    }
    
}
