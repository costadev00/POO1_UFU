/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_lista1;
import java.util.Scanner;
/**
 *
 * @author costa
 */
public class Ex1_lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b,aux=0;
        System.out.println("Digite o valor de A:");
        a = ler.nextInt();
        System.out.println("Digite o valor de B:");
        b = ler.nextInt();
        if(a%b==0){
            aux = b;
            b=a;
            a = aux;
        }
        else if(b%a ==0){
            System.out.println("ok");
        }
        else{
            a=0;
        }
        System.out.println("A = "+a);
        System.out.println("B = " +b);
    }
    
}
