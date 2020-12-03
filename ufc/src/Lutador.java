public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float at, float pe, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = at;
        this.setPeso(pe);
        vitorias = v;
        derrotas = d;
        empates = e;
    }

    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso " + getPeso() + "kg");
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso: " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getEmpates() + " empates");
        System.out.println(getDerrotas() + " derrotas");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);

    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(float peso) {
        if (peso < 52.2) {
            this.categoria = "Lutador inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Peso leve";
        } else if (peso <= 83.9) {
            this.categoria = "Peso medio";
        } else if (peso <= 120.2) {
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Inválido";
        }
        // this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(peso);
    }
}