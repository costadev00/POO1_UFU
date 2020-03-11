/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troca_de_variaveis;
import java.util.Scanner;
/**
 *
 * @author facom
 */
public class Troca_de_variaveis {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x, y, z;
        Scanner ler  = new Scanner(System.in);
        x = ler.nextFloat();
        System.out.println("x = " + x);
        y = ler.nextShort();
        System.out.println("y  " +  y);
        z = x;
        x = y;
        y = z;
        System.out.println("agora x = " + x);
        System.out.println("agora y = " + y);
    }
    
}
