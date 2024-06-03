package actividadno3;
/**2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3
 *(para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez)
 * comprendidos entre 1 y n (n es determinado por el usuario).
 * Imprimir la cantidad de múltiplos de 5 y 3.
 */ 

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double suma = 0; 
        int acumulador = 0;
        double rangoSuma;
        int cantMultiplos = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ponga un numero: ");
        rangoSuma = leer.nextDouble();
        int i = 1;
        for(i=1; i<=rangoSuma; i++){
            if(i%5==0 && i%3 ==0){
                suma = suma+i;
                cantMultiplos++;
            }
        }
        System.out.println("El numero de multiplos de 5 y 3 es: "+ cantMultiplos);
        System.out.println("La suma total de numeros multiplos de 3 y 5 es: "+ suma);
    }
}