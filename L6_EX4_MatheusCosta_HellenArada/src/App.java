import java.util.Scanner;
//Hellen Harada, Matheus Costa, 14/12/2020 
public class App {

    public static void main(String[] args) {

        int a, b;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros:");
        a = ler.nextInt();
        b = ler.nextInt();

        try {
            if (a < 0 && b < 0) {
                throw new NumerosNegativosoException("Os dois números não podem ser negativos ao mesmo tempo!");
            }
            if (a == b) {
                throw new NumerosIguaisException("Os numeros nao podem ser iguais!");
            }
            if (b == 0) {
                throw new SegundoNumeroIgualZeroException("O segundo numero deve ser diferente de 0!");
            }
        } catch (NumerosNegativosoException e) {
            System.out.println("Erro:" + e.getMessage());

        } catch (NumerosIguaisException e) {
            System.out.println("Erro:" + e.getMessage());

        } catch (SegundoNumeroIgualZeroException e) {
            System.out.println("Erro:" + e.getMessage());

        } finally {
            System.out.println("O valor do primeiro numero: " + a + "\nO valor do segundo numero: " + b);

        }

    }

}
