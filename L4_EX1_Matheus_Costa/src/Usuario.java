import java.util.regex.*;

/**
 * Usuario
 */
public class Usuario {
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public String cpf, nome, telefone, usuario, senha;

    public Usuario(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = cpf;
        this.senha = telefone;
    }

    public Usuario(String cpf, String nome, String telefone, String email) {
        if (validarEmail(email)) {
            this.usuario = email;
        } else {
            this.usuario = cpf;
        }
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = telefone;
    }

    public Usuario(String cpf, String nome, String telefone, String email, String senha) {
        if (validarEmail(email)) {
            this.usuario = email;
        } else {
            this.usuario = cpf;
        }
        if (senha.length() < 6) {
            this.senha = telefone;
        } else {
            this.senha = senha;
        }
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public static boolean validarEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}