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
        
        while(true){
            System.out.print("Introduzcca el rango inicial: ");
            rangoInicial = leer.nextInt();
            
            System.out.print("Introduzca el rango final: ");
            rangoFinal = leer.nextInt();
            
            if(rangoInicial<rangoFinal){
                int suma = 0;
                    
                for(int i = rangoInicial; i<=rangoFinal; i++){
                    if(i%2 == 0){
                        suma = suma+i;
                        }
                }
                System.out.println("La suma de los numeros pares entre el rango: ["+ rangoInicial+","+ rangoFinal+ "] es: "+ suma);
                break;
            }else{
                System.out.println("Vuelva a dar los datos: El rango inicial tiene que ser menor al rango final");
            }    
        }
        
      
            
    }
    
}
