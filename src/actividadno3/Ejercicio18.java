package actividadno3;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    /**Generar una matriz nxn (dado por el usuario) 
     * el valor de n debe ser mayor a 2 y menor a 10 y 
     * llenarla con números aleatorios
     */
    public static void main(String[] args) {
        int nFilas;
        int nColumnas;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas dentro de la matriz (Tiene que ser mayor a 2 y menor a 10): "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de Columnas dentro de la matriz (Tiene que ser mayor a 2 y menor a 10): "));
        if(nFilas>2 && nFilas<10){
            if(nColumnas > 2 && nColumnas< 10){
                int matriz[][] = new int[nFilas][nColumnas];
                for(int i = 0; i<matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        matriz[i][j] = (int) (Math.random()*100);
                    }
                }
                for(int i = 0; i<matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        System.out.print(matriz[i][j]+"\t");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("El numero de columnas dado: "+nColumnas+" no coincide con lo solicitado, vuelvalo a intentar.");
            }
        }else{
            System.out.println("El numero de filas dado: "+nFilas+" no coincide con lo solicitado, vuelvalo a intentar.");    
        }
    }
    
}
