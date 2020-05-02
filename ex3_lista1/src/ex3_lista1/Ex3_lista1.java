package ex3_lista1;

import java.util.Scanner;

public class Ex3_lista1 {

    public static void main(String[] args) {
        int alunos[] = new int[12];
        int maior_nota, quant1 = 0;
        int seg_nota, quant2 = 0;
        int ter_nota, quant3 = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Quantos problemas o aluno " + i + " resolveu?");
            Scanner x = new Scanner(System.in);
            alunos[i] = x.nextInt();
        }

        maior_nota = alunos[0];
        seg_nota = alunos[0];
        ter_nota = alunos[0];
        quant1 = 1;
        quant2 = 1;
        quant3 = 1;

        for (int i = 1; i < 12; i++) {
            System.out.println(i);

            if (alunos[i] > maior_nota) {
                maior_nota = alunos[i];
                quant1 = 1;
            } else if (alunos[i] == maior_nota) {
                quant1++;
            }
        }

        for (int i = 1; i < 12; i++) {
            if (alunos[i] > seg_nota && alunos[i] < maior_nota) {
                seg_nota = alunos[i];
                quant2 = 1;
            } else if (alunos[i] == seg_nota) {
                quant2++;
            }
        }

        for (int i = 1; i < 12; i++) {
            if (alunos[i] > ter_nota && alunos[i] < seg_nota) {
                ter_nota = alunos[i];
                quant3 = 1;
            } else if (alunos[i] == ter_nota) {
                quant3++;
            }

        }

        System.out.println("Primeiro lugar: " + maior_nota + ":" + quant1 + " alunos");
        System.out.println("Segundo Lugar: " + seg_nota + ":" + quant2 + " alunos");
        System.out.println("Terceira lugar: " + ter_nota + ":" + quant3 + " alunos");
    }

}