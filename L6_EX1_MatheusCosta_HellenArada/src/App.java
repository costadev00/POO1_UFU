//Hellen Harada, Matheus Costa, 14/12/2020 

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        
        double a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois valores para que possa ser feito uma divisao:");
        a = ler.nextInt();
        b = ler.nextInt();

        try {
            if (b == 0) {
                throw new DivisaoException("Denominador deve ser diferente de 0!");
            }
            c = a / b;
            System.out.println("A divisao de " + a + " com " + b + " tem como resultado " + c);
        } catch (DivisaoException e) {
            System.out.println("Divisão nao efetuada:" + e.getMessage());
        }
        
    }
    
}
