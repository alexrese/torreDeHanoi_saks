/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torredehanoi;

/**
 *
 * @author alexr
 */
public class TorreDeHanoi {

    /**
     * @param args the command line arguments
     */
    private static int cont = 1;
    public static void main(String[] args) {
        // TODO code application logic here
        torresDeHanoi(10, "primeiro pino", "pino final", "pino temporário");
    }
    
    private static void torresDeHanoi(int numeroDeAneis, String origem, String destino, String auxiliar){
        if(numeroDeAneis > 0){
            torresDeHanoi(numeroDeAneis -1, origem, auxiliar, destino);
            System.out.println("Mover pino " + numeroDeAneis + " de " + origem + " para " + destino);   
            cont++;
            System.out.println("Movimento:" + cont);
            torresDeHanoi(numeroDeAneis -1, auxiliar, destino, origem);
        }
    }
}
