package actividadno3;

import java.util.Scanner;

/**Realizar un programa en Java que dado n cantidad de números 
 * determine si es primo o no y si ese número primo es múltiplo de 3, 
 * se debe contar. Imprimir cantidad de primos y cantidad de múltiplos de 3
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int rango;
        int cantPrimos= 0;
        int cantMultiplosPrimos = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de numeros a revisar: ");
        rango = leer.nextInt();
        for(int i = 1; i < rango; i++){
            if(i %2 ==0){
                cantPrimos++;
                if(i%2==0 && i%3==0 ){
                    cantMultiplosPrimos ++;
                }
            }
        }
        System.out.println("La cantidad de numeros primos en el rango de "+rango+" numeros es: "+ cantPrimos);
        System.out.println("La cantidad de numeros primos y multiplos de 3 es: "+ cantMultiplosPrimos);
    }
    
}
