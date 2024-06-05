package actividadno3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8 {
    /**Dado N cantidad de precios de gaseosas en un supermercado 
     * el gerente de ventas desea que se genere un programa que 
     * le permita saber cuál de las gaseosas tiene el mayor precio, 
     * cuál tiene menor precio y cuál es el precio promedio. 
     * Hacer las impresiones según lo requerido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nGaseosas;
        nGaseosas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de gaseosas"));
        if(nGaseosas<=0){
            System.out.println("El numero de gaseosas debe ser mayor a 0");
        }
        int[] valorGaseosas = new int[nGaseosas];
        
        for(int i=0;i <nGaseosas; i++){
            System.out.println("Introduzca los precios de las gaseosas ");
            valorGaseosas[i]= leer.nextInt();
            System.out.println("precio "+(i+1)+": "+valorGaseosas[i]);
        }
        
        int pMaximo = valorGaseosas[0];
        int pMinimo = valorGaseosas[0];
        int suma = 0;
        
        for(int i =0; i< nGaseosas;i++){
            if(valorGaseosas[i]>pMaximo){
                pMaximo = valorGaseosas[i];
            } else if(valorGaseosas[i]<pMinimo){
                pMinimo = valorGaseosas[i];
            }
            suma += valorGaseosas[i];
        }
        
        System.out.println("El precio maximo es: " + pMaximo);
        System.out.println("El precio minimo es: " + pMinimo);   
        System.out.println("El precio promedio es: " + suma/nGaseosas);
    }
    
}
