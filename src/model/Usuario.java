package model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private int pontuacao;

    public Usuario() {
        this.id = -1;
        this.nome = "";
        this.email = "";
        this.senha = "";
        this.pontuacao = -1;
    }

    public Usuario(int id, String nome, String email, String senha, int pontuacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pontuacao = pontuacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
