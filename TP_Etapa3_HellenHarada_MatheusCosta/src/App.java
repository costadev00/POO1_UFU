import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        try {

            String cpf, nome, matricula, curso = null, areaatuacao = null;
            double salario = 0.0;
            boolean valido;
            int quantmaterias, quantmatministrada, i = -1, j, a, b, c, d, f, g, cont;
            Pessoa pessoa[] = new Pessoa[60];
            Scanner ler = new Scanner(System.in);

            do {
                System.out.println("\n\nDigite o numero de acordo com a opcao desejada:");
                System.out.println("1 - Novo cadastrar");
                System.out.println("2 - Consultar");
                System.out.println("3 - Alterar dados");
                System.out.println("0 - Sair");
                a = ler.nextInt();
                switch (a) {
                    case 1:
                        do {
                            System.out.println("\n\nDigite o numero de acordo com a opcao desejada:");
                            System.out.println("1 - Cadastrar um aluno");
                            System.out.println("2 - Cadastrar um professor");
                            System.out.println("3 - Cadastrar uma materia");
                            System.out.println("0 - voltar");
                            b = ler.nextInt();
                            switch (b) {
                                case 1:
                                    i++;
                                    pessoa[i] = new Aluno();
                                    System.out.println("\nDigite o cpf:");
                                    ler.nextLine();
                                    cpf = ler.nextLine();
                                    try {
                                        if (cpf.length() != 11) {
                                            throw new CpfException();
                                        }
                                        valido = true;
                                        for (j = 0; j <= i; j++) {
                                            try {
                                                if (cpf.equals(pessoa[j].getCpf())) {
                                                    throw new CpfexistenteException();
                                                }
                                            } catch (CpfexistenteException e) {
                                                System.out.println(e.getMessage());
                                                valido = false;
                                            }

                                        }

                                        if (valido == true) {
                                            System.out.println("Digite o nome:");
                                            nome = ler.nextLine();
                                            System.out.println("Digite a matricula:");
                                            matricula = ler.nextLine();
                                            do {
                                                System.out.println("Digite a opcao com o curso:");
                                                System.out.println("1 - Medicina");
                                                System.out.println("2 - Sistemas de Informacao");
                                                System.out.println("3 - Pedagogia");
                                                System.out.println("4 - Agronomia");
                                                System.out.println("5 - Musica");
                                                System.out.println("6 - Outro");
                                                d = ler.nextInt();
                                                switch (d) {
                                                    case 1:
                                                        curso = "Medicina";
                                                        break;
                                                    case 2:
                                                        curso = "Sistemas de Informacao";
                                                        break;
                                                    case 3:
                                                        curso = "Pedagogia";
                                                        break;
                                                    case 4:
                                                        curso = "Agronomia";
                                                        break;
                                                    case 5:
                                                        curso = "Musica";
                                                        break;
                                                    case 6:
                                                        System.out.println("Digite o curso:");
                                                        ler.nextLine();
                                                        curso = ler.nextLine();
                                                        break;
                                                    default:
                                                        System.out.println("Opcao invalida");
                                                }
                                            } while (d > 6 || d < 1);

                                            do {
                                                System.out.println("Digite a quantidade de materias cursadas:");

                                                quantmaterias = ler.nextInt();
                                                try {
                                                    if (quantmaterias < 2 || quantmaterias > 9) {
                                                        throw new QuantmateriasException();
                                                    }
                                                } catch (QuantmateriasException e) {
                                                    System.out.println(e.getMessage());

                                                }

                                            } while (quantmaterias < 2 || quantmaterias > 9);
                                            ((Aluno) pessoa[i]).Cadastro(cpf, nome, matricula, quantmaterias, curso);

                                        }

                                    } catch (CpfException e) {
                                        System.out.println(e.getMessage());
                                        i--;
                                    }

                                    break;

                                case 2:
                                    i++;
                                    pessoa[i] = new Professor();

                                    System.out.println("\nDigite o cpf:");
                                    ler.nextLine();
                                    cpf = ler.nextLine();
                                    try {
                                        if (cpf.length() != 11) {
                                            throw new CpfException();
                                        }
                                        valido = true;
                                        for (j = 0; j <= i; j++) {
                                            try {
                                                if (cpf.equals(pessoa[j].getCpf())) {
                                                    throw new CpfexistenteException();
                                                }
                                            } catch (CpfexistenteException e) {
                                                System.out.println(e.getMessage());
                                                valido = false;
                                            }

                                        }

                                        if (valido == true) {
                                            System.out.println("Digite o nome:");
                                            nome = ler.nextLine();

                                            do {
                                                System.out.println("Digite a opcao com a area de atuacao:");
                                                System.out.println("1 - Tecnologia");
                                                System.out.println("2 - Ciencias da Saude");
                                                System.out.println("3 - Artes");
                                                System.out.println("4 - Ciencias Biologicas");
                                                System.out.println("5 - Ciencias Sociais");
                                                System.out.println("6 - Outro");
                                                d = ler.nextInt();
                                                switch (d) {
                                                    case 1:
                                                        areaatuacao = "Tecnologia";
                                                        break;
                                                    case 2:
                                                        areaatuacao = "Ciencias da Saude";
                                                        break;
                                                    case 3:
                                                        areaatuacao = "Artes";
                                                        break;
                                                    case 4:
                                                        areaatuacao = "Ciencias Biologicas";
                                                        break;
                                                    case 5:
                                                        areaatuacao = "Ciencias Sociais";
                                                        break;
                                                    case 6:
                                                        System.out.println("Digite a area de atuacao:");
                                                        areaatuacao = ler.nextLine();
                                                        break;
                                                    default:
                                                        ler.nextLine();
                                                        System.out.println("Opcao invalida");
                                                }
                                            } while (d > 6 || d < 1);

                                            do {
                                                try {
                                                    System.out.println("Digite o salario:");
                                                    salario = -1;
                                                    ler.nextLine();
                                                    salario = ler.nextDouble();
                                                } catch (InputMismatchException e) {
                                                    System.out.println("ERRO na leitura");
                                                }
                                            } while (salario == -1);
                                            do {
                                                System.out.println("Digite a quantidade de materias ministradas:");
                                                quantmatministrada = ler.nextInt();
                                                try {
                                                    if (quantmatministrada < 1 || quantmatministrada > 3) {
                                                        throw new QuantmateriasException();
                                                    }
                                                } catch (QuantmateriasException e) {
                                                    System.out.println(e.getMessage());

                                                }
                                            } while (quantmatministrada < 1 || quantmatministrada > 3);

                                            ((Professor) pessoa[i]).Cadastro(cpf, nome, areaatuacao, quantmatministrada,
                                                    salario);
                                        }
                                    } catch (CpfException e) {
                                        System.out.println(e.getMessage());
                                        i--;
                                    }

                                    break;
                                case 3:
                                    // fazer o cadastro da materia
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                            }
                        } while (b != 0);
                        break;
                    case 2:
                        do {
                            System.out.println("\n\nDigite o numero de acordo com a opcao desejada:");
                            System.out.println("1 - Consutar cpf");
                            System.out.println("2 - Consultar alunos por curso");
                            System.out.println("3 - Consultar professores por area de atuacao");
                            System.out.println("4 - cosultar uma materia");
                            System.out.println("0 - Voltar");
                            c = ler.nextInt();
                            switch (c) {
                                case 1:
                                    System.out.println("\n\nDigite o cpf:");
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
                                    break;
                                case 2:
                                    do {
                                        System.out.println("Digite a opcao com o curso:");
                                        System.out.println("1 - Medicina");
                                        System.out.println("2 - Sistemas de Informacao");
                                        System.out.println("3 - Pedagogia");
                                        System.out.println("4 - Agronomia");
                                        System.out.println("5 - Musica");
                                        System.out.println("6 - Outro");
                                        d = ler.nextInt();
                                        switch (d) {
                                            case 1:
                                                curso = "Medicina";
                                                break;
                                            case 2:
                                                curso = "Sistemas de Informacao";
                                                break;
                                            case 3:
                                                curso = "Pedagogia";
                                                break;
                                            case 4:
                                                curso = "Agronomia";
                                                break;
                                            case 5:
                                                curso = "Musica";
                                                break;
                                            case 6:
                                                System.out.println("Digite o curso:");
                                                ler.nextLine();
                                                curso = ler.nextLine();
                                                break;
                                            default:
                                                System.out.println("Opcao invalida");
                                        }
                                    } while (d > 6 || d < 1);
                                    cont = 0;
                                    for (j = 0; j <= i; j++) {
                                        if (pessoa[j] instanceof Aluno) {
                                            if (curso.equals(((Aluno) pessoa[j]).getCurso())) {
                                                cont++;
                                                pessoa[j].mostrar();
                                            }
                                        }
                                    }

                                    System.out.println("\nHa " + cont + " alunos matriculados nesse curso");
                                    break;
                                case 3:
                                    do {
                                        System.out.println("Digite a opcao com a area de atuacao:");
                                        System.out.println("1 - Tecnologia");
                                        System.out.println("2 - Ciencias da Saude");
                                        System.out.println("3 - Artes");
                                        System.out.println("4 - Ciencias Biologicas");
                                        System.out.println("5 - Ciencias Sociais");
                                        System.out.println("6 - Outro");
                                        d = ler.nextInt();
                                        switch (d) {
                                            case 1:
                                                areaatuacao = "Tecnologia";
                                                break;
                                            case 2:
                                                areaatuacao = "Ciencias da Saude";
                                                break;
                                            case 3:
                                                areaatuacao = "Artes";
                                                break;
                                            case 4:
                                                areaatuacao = "Ciencias Biologicas";
                                                break;
                                            case 5:
                                                areaatuacao = "Ciencias Sociais";
                                                break;
                                            case 6:
                                                System.out.println("Digite a area de atuacao:");
                                                areaatuacao = ler.nextLine();
                                                break;
                                            default:
                                                ler.nextLine();
                                                System.out.println("Opcao invalida");
                                        }
                                    } while (d > 6 || d < 1);
                                    cont = 0;
                                    for (j = 0; j <= i; j++) {
                                        if (pessoa[j] instanceof Professor) {
                                            if (areaatuacao.equals(((Professor) pessoa[j]).getAreaatuacao())) {
                                                cont++;
                                                pessoa[j].mostrar();
                                            }
                                        }
                                    }

                                    System.out.println("\nHa " + cont + " professores atuando nessa area");
                                    break;
                                case 4:
                                    // consultar materia
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                            }
                        } while (c != 0);

                        break;
                    case 3:
                        do {
                            System.out.println("\n\nDigite o numero de acordo com a opcao desejada:");
                            System.out.println("1 - Alterar dados de uma pessoa");
                            System.out.println("2 - Alterar dados de uma materia");
                            System.out.println("0 - voltar");
                            g = ler.nextInt();
                            switch (g) {
                                case 1:
                                    System.out.println("\n\nDigite o cpf:");
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
                                    } else {
                                        if (pessoa[j] instanceof Aluno) {
                                            System.out.println("\nDigite a opcao do dado a ser alterado:");
                                            System.out.println("1 - Nome");
                                            System.out.println("2 - Matricula");
                                            System.out.println("3 - Curso");
                                            System.out.println("4 -Quantidade de materias cursadas");
                                            System.out.println("0 - voltar");
                                            f = ler.nextInt();
                                            switch (f) {
                                                case 1:
                                                    System.out.println("Digite o nome:");
                                                    ler.nextLine();
                                                    nome = ler.nextLine();
                                                    pessoa[j].setNome(nome);
                                                    break;
                                                case 2:
                                                    System.out.println("Digite a matricula:");
                                                    ler.nextLine();
                                                    matricula = ler.nextLine();
                                                    ((Aluno) pessoa[j]).setMatricula(matricula);
                                                    break;
                                                case 3:
                                                    do {
                                                        System.out.println("Digite a opcao com o curso:");
                                                        System.out.println("1 - Medicina");
                                                        System.out.println("2 - Sistemas de Informacao");
                                                        System.out.println("3 - Pedagogia");
                                                        System.out.println("4 - Agronomia");
                                                        System.out.println("5 - Musica");
                                                        System.out.println("6 - Outro");
                                                        d = ler.nextInt();
                                                        switch (d) {
                                                            case 1:
                                                                curso = "Medicina";
                                                                break;
                                                            case 2:
                                                                curso = "Sistemas de Informacao";
                                                                break;
                                                            case 3:
                                                                curso = "Pedagogia";
                                                                break;
                                                            case 4:
                                                                curso = "Agronomia";
                                                                break;
                                                            case 5:
                                                                curso = "Musica";
                                                                break;
                                                            case 6:
                                                                System.out.println("Digite o curso:");
                                                                ler.nextLine();
                                                                curso = ler.nextLine();
                                                                break;
                                                            default:
                                                                System.out.println("Opcao invalida");
                                                        }
                                                    } while (d > 6 || d < 1);
                                                    ((Aluno) pessoa[j]).setCurso(curso);
                                                    break;
                                                case 4:
                                                    do {
                                                        System.out.println("Digite a quantidade de materias cursadas:");
                                                        ler.nextInt();
                                                        quantmaterias = ler.nextInt();
                                                        try {
                                                            if (quantmaterias < 2 || quantmaterias > 9) {
                                                                throw new QuantmateriasException();
                                                            }
                                                        } catch (QuantmateriasException e) {
                                                            System.out.println(e.getMessage());

                                                        }
                                                    } while (quantmaterias < 2 || quantmaterias > 9);
                                                    ((Aluno) pessoa[j]).setQuantmaterias(quantmaterias);
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opcao invalida");
                                            }

                                        } else {
                                            System.out.println("\nDigite a opcao do dado a ser alterado:");
                                            System.out.println("1 - Nome");
                                            System.out.println("2 - Area de atuacao");
                                            System.out.println("3 - Quantidade de materias ministradas");
                                            System.out.println("4 - Salario");
                                            System.out.println("0 - voltar");
                                            f = ler.nextInt();
                                            switch (f) {
                                                case 1:
                                                    System.out.println("Digite o nome:");
                                                    ler.nextLine();
                                                    nome = ler.nextLine();
                                                    pessoa[j].setNome(nome);
                                                    break;
                                                case 2:
                                                    do {
                                                        System.out.println("Digite a opcao com a area de atuacao:");
                                                        System.out.println("1 - Tecnologia");
                                                        System.out.println("2 - Ciencias da Saude");
                                                        System.out.println("3 - Artes");
                                                        System.out.println("4 - Ciencias Biologicas");
                                                        System.out.println("5 - Ciencias Sociais");
                                                        System.out.println("6 - Outro");
                                                        d = ler.nextInt();
                                                        switch (d) {
                                                            case 1:
                                                                areaatuacao = "Tecnologia";
                                                                break;
                                                            case 2:
                                                                areaatuacao = "Ciencias da Saude";
                                                                break;
                                                            case 3:
                                                                areaatuacao = "Artes";
                                                                break;
                                                            case 4:
                                                                areaatuacao = "Ciencias Biologicas";
                                                                break;
                                                            case 5:
                                                                areaatuacao = "Ciencias Sociais";
                                                                break;
                                                            case 6:
                                                                System.out.println("Digite a area de atuacao:");
                                                                areaatuacao = ler.nextLine();
                                                                break;
                                                            default:
                                                                ler.nextLine();
                                                                System.out.println("Opcao invalida");
                                                        }
                                                    } while (d > 6 || d < 1);
                                                    ((Professor) pessoa[j]).setAreaatuacao(areaatuacao);
                                                    break;
                                                case 3:

                                                    do {

                                                        try {
                                                            System.out.println("Digite o salario:");
                                                            salario = -1;
                                                            ler.nextLine();
                                                            salario = ler.nextDouble();
                                                        } catch (InputMismatchException e) {
                                                            System.out.println("ERRO na leitura");
                                                        }
                                                    } while (salario == -1);
                                                    ((Professor) pessoa[j]).setSalario(salario);
                                                    break;
                                                case 4:
                                                    do {
                                                        System.out.println(
                                                                "Digite a quantidade de materias ministradas:");
                                                        quantmatministrada = ler.nextInt();
                                                        try {
                                                            if (quantmatministrada < 1 || quantmatministrada > 3) {
                                                                throw new QuantmateriasException();
                                                            }
                                                        } catch (QuantmateriasException e) {
                                                            System.out.println(e.getMessage());

                                                        }
                                                    } while (quantmatministrada < 1 || quantmatministrada > 3);
                                                    ((Professor) pessoa[j]).setQuantmatministrada(quantmatministrada);
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opcao invalida");
                                            }

                                        }

                                    }
                                case 2:
                                    // alterar dados da materia
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                            }

                        } while (g != 0);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcao invalida");

                }

            } while (a != 0);
        } catch (NullPointerException e) {
            System.out.println("e.getMensager");
            System.exit(1);
        }
    }

}
