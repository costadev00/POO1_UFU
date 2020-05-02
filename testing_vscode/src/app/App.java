// 3) Escreva um programa em Java que leia o número de problemas
// resolvidos por cada um dos 12 alunos que participaram da competição e mostre
// na tela quantos problemas foram resolvidos pelo primeiro e segundo lugares,
// separadamente, e quantos alunos resolveram o número de problemas referente
// a cada uma das colocações. Por exemplo, Primeiro lugar: 79 (2 alunos), Segundo
// lugar: 76 (3 alunos).

package app;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(final String[] args) throws Exception {
        final Scanner ler = new Scanner(System.in);
        int j = 1;
        final int problema_resolvido[] = new int[12];
        final int colocacao[] = new int[12];

        // final int aluno[] = new int[3];
        // int aux[] = new int[12];
        // int primeiro=0, segundo=0;
        for (int i = 0; i < 12; i++) {
            System.out.println("Quantos problemas o aluno " + i + " resolveu?");
            problema_resolvido[i] = ler.nextInt();

            if (problema_resolvido[i] == problema_resolvido[i - 1]) {
                colocacao[i] = colocacao[i - 1];
            } else {
                colocacao[i] = i;
            }
        }
        Arrays.sort(problema_resolvido);
        for (int i = 11; i >= 0; i--) {
            System.out.println(colocacao[i] + "º lugar:" + problema_resolvido[i] + " problemas");
            j++;
            // System.out.println("temos " + empatado + " empatados");

        }
    }
}
