package actividadno3;

import javax.swing.JOptionPane;

public class Ejercicio15 {
    /*Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente
    *con los números impares partiendo desde n 
    *(n es dada por el usuario) y se imprima.
    */
    public static void main(String[] args) {
        int matriz[][] = new int[5][6];
        
        int nPartir = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero inicial: "));
        for(int i = 0; i<matriz.length; i++){
            for(int j=0;j<matriz[i].length; j++){
                if(nPartir %2==0){
                    nPartir++;
                }else{
                    matriz[i][j] = nPartir;
                    nPartir+=2;
                }
                
            }
            
        }
        for(int i = 0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length ; j++){
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        }
        
        
    }
    
}
