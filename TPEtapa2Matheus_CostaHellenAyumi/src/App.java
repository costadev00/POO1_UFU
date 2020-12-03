import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String cpf, nome, matricula, curso, areaatuacao, cargo;
        double salario;
        boolean valido;
        int quantmaterias, quantmatministrada, i = -1, j, a, b, c, cont;
        Pessoa pessoa[] = new Pessoa[60];
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite o numero de acordo com a opcao desejada:");
            System.out.println("1 - Novo cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("0 - Sair");
            a = ler.nextInt();
            if (a == 1) {
                do {
                    System.out.println("Digite o numero de acordo com a opcao desejada:");
                    System.out.println("1 - Cadastrar um aluno");
                    System.out.println("2 - Cadastrar um professor");
                    System.out.println("0 - voltar");
                    b = ler.nextInt();

                    if (b == 1) {
                        i++;
                        pessoa[i] = new Aluno();
                        System.out.println("Digite o cpf:");
                        ler.nextLine();
                        cpf = ler.nextLine();
                        if (cpf.length() == 11) {
                            valido = true;
                            for (j = 0; j <= i; j++) {
                                if (cpf.equals(pessoa[j].getCpf())) {
                                    System.out.println("Cpf ja cadastrado!");
                                    valido = false;
                                    break;
                                }

                            }

                            if (valido == true) {
                                System.out.println("Digite o nome:");
                                nome = ler.nextLine();
                                System.out.println("Digite a matricula:");
                                matricula = ler.nextLine();
                                System.out.println(
                                        "Digite o curso:(Medicina, Sistemas de Informacao, Pedagogia, Agronomia, Musica)");
                                curso = ler.nextLine();
                                do {
                                    System.out.println("Digite a quantidade de materias cursadas:");
                                    quantmaterias = ler.nextInt();
                                    if (quantmaterias < 2 || quantmaterias > 9) {
                                        System.out.println("Quantidade de materias nao permitida!");

                                    }
                                } while (quantmaterias < 2 || quantmaterias > 9);
                                cargo = "Aluno";
                                ((Aluno) pessoa[i]).Cadastro(cpf, nome, matricula, quantmaterias, curso, cargo);

                            }
                        } else {
                            System.out.println("Cpf invalido!");
                            i--;

                        }

                    } else if (b == 2) {
                        i++;
                        pessoa[i] = new Professor();

                        System.out.println("Digite o cpf:");
                        ler.nextLine();
                        cpf = ler.nextLine();
                        if (cpf.length() == 11) {
                            valido = true;
                            for (j = 0; j <= i; j++) {
                                if (cpf.equals(pessoa[i].getCpf())) {
                                    System.out.println("Cpf ja cadastrado!");
                                    valido = false;
                                    break;
                                }

                            }

                            if (valido == true) {
                                System.out.println("Digite o nome:");
                                nome = ler.nextLine();
                                System.out.println(
                                        "Digite a area de atuacao:(Tecnologia, Ciencias da Saude, Artes,Ciencias Biologicas, Ciencias Sociais)");
                                areaatuacao = ler.nextLine();
                                System.out.println("Digite o salario:");
                                salario = ler.nextDouble();
                                do {
                                    System.out.println("Digite a quantidade de materias ministradas:");
                                    quantmatministrada = ler.nextInt();
                                    if (quantmatministrada < 1 || quantmatministrada > 3) {
                                        System.out.println("Quantidade de materias nao permitida!");

                                    }
                                } while (quantmatministrada < 1 || quantmatministrada > 3);
                                cargo = "Professor";
                                ((Professor) pessoa[i]).Cadastro(cpf, nome, areaatuacao, quantmatministrada, salario,
                                        cargo);

                            }
                        } else {
                            System.out.println("Cpf invalido!");
                            i--;

                        }
                    } else if (b != 0) {
                        System.out.println("Opcao invalida");
                    }

                } while (b != 0);

            } else if (a == 2) {
                do {
                    System.out.println("Digite o numero de acordo com a opcao desejada:");
                    System.out.println("1 - Consutar cpf");
                    System.out.println("2 - Consultar alunos por curso");
                    System.out.println("3 - Consultar professores por area de atuacao");
                    System.out.println("0 - Voltar");
                    c = ler.nextInt();
                    if (c == 1) {
                        System.out.println("Digite o cpf:");
                        ler.nextLine();
                        cpf = ler.nextLine();
                        valido = false;
                        for (j = 0; j <= i; j++) {
                            if (cpf.equals(pessoa[j].getCpf())) {
                                pessoa[j].mostrar();
                                valido = true;
                                break;
                            }
                        }
                        if (valido == false) {
                            System.out.println("Cpf nao encontrado!");
                        }
                    } else if (c == 2) {
                        System.out.println(
                                "Digite o Curso:(Medicina, Sistemas de Informacao, Pedagogia, Agronomia, Musica)");
                        ler.nextLine();
                        curso = ler.nextLine();
                        cont = 0;
                        for (j = 0; j <= i; j++) {
                            if ("Aluno".equals(pessoa[j].getCargo())) {
                                if (curso.equals(((Aluno) pessoa[j]).getCurso())) {
                                    cont++;
                                }
                            }
                        }

                        System.out.println("Ha " + cont + " alunos matriculados nesse curso");

                    } else if (c == 3) {
                        System.out.println(
                                "Digite a area de atuacao:(Tecnologia, Ciencias da Saude, Artes,Ciencias Biologicas, Ciencias Sociais)");
                        ler.nextLine();
                        areaatuacao = ler.nextLine();
                        cont = 0;
                        for (j = 0; j <= i; j++) {
                            if ("Professor".equals(pessoa[j].getCargo())) {
                                if (areaatuacao.equals(((Professor) pessoa[j]).getAreaatuacao())) {
                                    cont++;
                                }
                            }
                        }

                        System.out.println("Ha " + cont + " professores atuando nessa area");

                    } else if (c != 0) {
                        System.out.println("Opcao invalida");
                    }
                } while (c != 0);

            } else if (a != 0) {
                System.out.println("Opcao invalida");
            }

        } while (a != 0);

    }

}
