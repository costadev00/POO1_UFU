
//Hellen Harada, Matheus Costa, 14/12/2020 

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
    
        String a;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o email:");
        a = ler.nextLine();

        try {
            if (( a.indexOf ("@")<0)) {
                throw new EmailNaoContemArrobaException("O email deve possuir o simbolo @!");
            }
            if (a.indexOf (".com")<0) {
                throw new EmailNaoContemPontoComException("O email deve conter .com !");
            }
        } catch (EmailNaoContemArrobaException e) {
            System.out.println("Erro:" + e.getMessage());

        } catch (EmailNaoContemPontoComException e) {
            System.out.println("Erro:" + e.getMessage());

        } finally {
            System.out.println("O email digitado: " + a);

        }
        
    }
    
}
