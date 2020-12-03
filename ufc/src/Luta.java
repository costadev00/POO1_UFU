import java.util.Random;

/**
 * Luta
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### Desafiado: ###");

            desafiado.apresentar();
            System.out.println("### Desafiante: ###");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("A luta empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " venceu!!");
                    this.desafiado.ganharLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " venceu!!");
                    this.desafiante.ganharLuta();
                    break;

                default:
                    break;
            }

        } else {
            System.out.println("Essa luta não pode acontecer");

        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}