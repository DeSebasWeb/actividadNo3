package actividadno3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**Leer N cantidad de notas (validar rango de notas), 
 * imprimir el promedio de las notas, la nota más alta y la más baja.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nNotas;
        nNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de notas: "));
        if(nNotas<=0){
            System.out.println("El numero de notas debe ser mayor a 0");
        }
        int[] nota = new int[nNotas];
        
        for(int i=0;i <nNotas; i++){
            System.out.println("Introduzca las notas de los estudiantes");
            nota[i]= leer.nextInt();
            System.out.println("Nota "+(i+1)+": "+nota[i]);
        }
        
        int notaMaxima = nota[0];
        int notaMinima = nota[0];
        int suma = 0;
        
        for(int i =0; i< nNotas;i++){
            if(nota[i]>notaMaxima){
                notaMaxima = nota[i];
            } else if(nota[i]<notaMinima){
                notaMinima = nota[i];
            }
            suma += nota[i];
        }
        System.out.println("La nota mas alta es: " + notaMaxima);
        System.out.println("La nota mas baja es: " + notaMinima);   
        System.out.println("Las notas en promedio son: " + suma/nNotas);
    }
    
}
