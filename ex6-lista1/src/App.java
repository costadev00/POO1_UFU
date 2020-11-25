
/*
6. Em uma competição online de programação, os alunos tinham que resolver o
maior número de problemas dentre os 100 problemas selecionados. Os alunos
que resolvessem o maior número de problemas seriam premiados com prêmios
diferentes para o primeiro e o segundo lugares. Dois ou mais alunos poderiam
resolver o mesmo número de problemas e ficarem empatados em alguma
colocação. Escreva um programa em Java que leia o número de problemas
resolvidos por cada um dos 12 alunos que participaram da competição e mostre
na tela quantos problemas foram resolvidos pelo primeiro e segundo lugares,
separadamente, e quantos alunos resolveram o número de problemas referente
a cada uma das colocações. Por exemplo, Primeiro lugar: 79 (2 alunos), Segundo
lugar: 76 (3 alunos).

*/

import java.util.Scanner;

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
