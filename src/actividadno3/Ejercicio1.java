package actividadno3;
import java.util.Scanner;
/**Hacer un programa en Java que sume los siguientes 
 * 25 impares que le siguen al
 * número n (n es determinado por el usuario). 
 * Imprimir los 25 impares y la suma.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double suma = 0;
        int contador = 0;
        double n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escoja un numero: ");
        n = leer.nextDouble();
        while(contador<25){
            n++;
            if(n%2 != 0){
                suma += n;
                System.out.println("EL numero que se acaba de sumar fue " + n);
                contador++;
            }                    
        }
        System.out.println("El total de la suma es:" + suma);
    }
}