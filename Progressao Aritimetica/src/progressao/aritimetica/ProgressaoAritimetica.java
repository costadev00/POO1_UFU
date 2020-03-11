/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressao.aritimetica;

import java.util.Scanner;

/**
 *
 * @author facom
 */
public class ProgressaoAritimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a1, n, r, result = 0;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        r = ler.nextInt();
        System.out.println("" + n);
        result = n;
        for (int i = 1; i < 20; i++) {
            result = result + r;
            System.out.println(result);
        }
    }

}
