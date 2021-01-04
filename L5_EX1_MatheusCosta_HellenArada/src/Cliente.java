/**
 * Cliente
 */
public class Cliente implements Classificavel {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente compara = (Cliente) o;
        if (this.nome.compareTo(compara.nome) < 0) {
            return true;
        } else if (this.nome.compareTo(compara.nome) == 0) {
            System.out.println("Nomes iguais...");
        } else {

        }
        return false;
    }

    @Override
    public void print(Classificavel obj) {
        System.out.println(this.obj);
    }

}