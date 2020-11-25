
//Matheus Costa, 06/11/2020 - Lista 1
import java.util.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int alunos[] = new int[12];
        int aux[] = new int[12];
        for (int i = 0; i < 12; i++) {
            aux[i] = 1;
        }
        for (int i = 0; i < 12; i++) {
            System.out.println("Quantos problemas o aluno " + i + " resolveu?");
            alunos[i] = ler.nextInt();
        }
        Arrays.sort(alunos);

        for (int i = 0; i < 11; i++) {
            if (alunos[i] == alunos[i + 1]) {
                aux[i]++;
            }
        }
        System.out.println("Primeiro lugar: " + alunos[11] + "(" + aux[11] + " alunos)");
        System.out.println("Segundo lugar: " + alunos[10] + "(" + aux[10] + " alunos)");
        System.out.println("Terceiro lugar: " + alunos[9] + "(" + aux[9] + " alunos)");
        System.out.println("Quarto lugar: " + alunos[8] + "(" + aux[8] + " alunos)");
        System.out.println("Quinto lugar: " + alunos[7] + "(" + aux[7] + " alunos)");
        System.out.println("Sexto lugar: " + alunos[6] + "(" + aux[6] + " alunos)");
        System.out.println("Setimo lugar: " + alunos[5] + "(" + aux[5] + " alunos)");
        System.out.println("Oitavo lugar: " + alunos[4] + "(" + aux[4] + " alunos)");
        System.out.println("Nono lugar: " + alunos[3] + "(" + aux[3] + " alunos)");
        System.out.println("Decimo lugar: " + alunos[2] + "(" + aux[2] + " alunos)");
        System.out.println("Decimo-primeiro: " + alunos[1] + "(" + aux[1] + " alunos)");
        System.out.println("Decimo-segundo lugar: " + alunos[0] + "(" + aux[0] + " alunos)");

    }
}
