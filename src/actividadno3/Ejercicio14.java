package actividadno3;
public class Ejercicio14 {
    /**Realizar un programa que genere un arreglo de 50 posiciones 
     * y se rellene de con la función ramdom de Java 
     * (los números deben ser 1 a 99), 
     * luego de llenar hacer la impresión de la matriz.
     */
    public static void main(String[] args) {
        int[] arregloMatriz = new int[50];
        for(int i = 0; i< arregloMatriz.length; i++){
            arregloMatriz[i] = (int) (Math.random()*99)+1;
        }
        System.out.println("Arreglo representado como matriz: ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arregloMatriz[i * 10 + j] + "\t");
            }
            System.out.println();
        }

        
    }
    
}
