package Classes;

import java.util.ArrayList;

import statusEnum.Status;
import statusUserEnum.StatusUsuario;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String descricao;
    private String email;
    private String senha;
    private String dataNascimento;

    private StatusUsuario status;

    private ArrayList<Projeto> projetos = new ArrayList<Projeto>();

    public Usuario() {
    }

    public Usuario(int idUsuario, String nome, String descricao, String email, String senha, String dataNascimento, StatusUsuario status) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.status = status;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    // substitui o Set pelo método atribuir projeto
    // public void setProjetos(ArrayList<Projeto> projetos) {
    //     this.projetos = projetos;
    // }
    public void atribuirProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void exibirProjetos() {
        for (Projeto projeto : projetos) {
            IO.print(projeto);
        }
    }

    public void login() {
        IO.print("usuário logado com sucesso!");
    }

    public void logout() {
        IO.print("usuário deslogado");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuário: ").append(getNome());
        sb.append("\nE-mail: ").append(getEmail());
        sb.append("\nStatus: ").append(getStatus());

        if (projetos.isEmpty()) {
            sb.append("Lista de projetos vazios");
            // IO.print("Lista de projetos vazia");
        } else {
            for (Projeto projeto : projetos) {
                sb.append("\nLista de projetos\n");
                sb.append(projeto);
                // IO.println(projeto);
            }
        }

        return sb.toString();
    }

}
