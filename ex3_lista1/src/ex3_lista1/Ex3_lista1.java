package ex3_lista1;

import java.util.*;

public class Ex3_lista1 {

    public static void main(String[] args) {
        int alunos[] = new int[12];
        int aux = 1;

        for (int i = 0; i < 12; i++) {
            System.out.println("Quantos problemas o aluno " + i + " resolveu?");
            Scanner x = new Scanner(System.in);
            alunos[i] = x.nextInt();
        }

        Arrays.sort(alunos);
        int a = alunos.length - 1;
        for (int i = 12; i >= 0; i++) {
            System.out.println(aux + " lugar: " + alunos[i]);
            aux++;
        }

    }
}