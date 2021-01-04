public class Editoras {
    private int razaoSocial;
    private String contato;
    private String telefone;

    public void cadastrarEdi(int razaoSocial, String contato, String telefone) {
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.telefone = telefone;
    }

    // public Editoras(int razaoSocial, String contato, String telefone) {
    // this.razaoSocial = razaoSocial;
    // this.contato = contato;
    // this.telefone = telefone;
    // }

    public int getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(int razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
