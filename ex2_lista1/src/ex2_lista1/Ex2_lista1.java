/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_lista1;

import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Ex2_lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = 0, menor = Integer.MAX_VALUE, acm = 0, media = 0;
        int nota[] = new int[10];
        for (int i = 0; i <= 6; i++) {

            System.out.println("Digite o valor da nota " + i);
            nota[i] = ler.nextInt();
            acm = acm + nota[i];
            maior = nota[0];
            if (nota[i] > maior) {
                maior = nota[i];
            }
            if (nota[i] < menor) {
                menor = nota[i];
            }
        }
        media = acm / 7;
        System.out.println("A media das notas é:" + media);
        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
    }

}
