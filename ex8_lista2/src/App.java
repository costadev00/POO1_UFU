import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int opcao;
        int pct;
        Funcionario f = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        String nome;
        String cpf;
        float salario;
        System.out.println("Digite o nome do funcionario");
        nome = ler.nextLine();

        System.out.println("Digite o cpf do funcionario");
        cpf = ler.nextLine();
        System.out.println("Digite o salario do funcionario");
        salario = ler.nextFloat();
        f.cadastrarFuncionario(nome, salario, cpf);

        System.out.println("Deseja modificar os dados dos funcionarios? 1 = Sim --- 0 = Nao");
        opcao = ler.nextInt();

        if (opcao == 1) {
            System.out.println("Digite um novo nome:");
            nome = ler.nextLine();
            f.setNome(nome);
            System.out.println("Digite um novo cpf:");
            cpf = ler.nextLine();
            f.setCpf(cpf);
            System.out.println("Digite um novo salario:");
            salario = ler.nextFloat();
            f.setSalario(salario);
            System.out.println("Dados alteraros com sucesso!");
        }

        System.out.println("Deseja aumentar o salario do funcionario? 1 = Sim --- 0 = Nao");
        opcao = ler.nextInt();
        if (opcao == 1) {
            System.out.println("Digite a porcentagem da qual deve ser aumentada:");
            pct = ler.nextInt();
            salario = f.getSalario();
            salario += salario * pct / 100;
            System.out.println("O novo salario é de :" + salario);
            System.out.println("Deseja realmente aumentar esse salario? 1 = Sim --- 0 = Nao");
            opcao = ler.nextInt();
            if (opcao == 1) {
                f.setSalario(salario);
            }
            System.out.println("Obrigado por utilizar D812 services");

        }
    }
}
