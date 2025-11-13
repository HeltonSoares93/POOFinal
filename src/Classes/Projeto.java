package Classes;

import java.util.ArrayList;

import projetoEnum.StatusProjeto;

public class Projeto {

    private int idProjeto;
    private String nome;
    private String descricao;
    private String dataInicial;
    private String dataConclusao;
    private StatusProjeto status;
    private Usuario responsavel;

    ArrayList<Tarefa> tarefas = new ArrayList<>();
    ArrayList<Usuario> participantes = new ArrayList<>();

    public Projeto() {
    }

    public Projeto(int idProjeto, String nome, String descricao, String dataInicial, String dataConclusao,
            Usuario usuario) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataConclusao = dataConclusao;
        this.responsavel = usuario;
        // this.participantes = null;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
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

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    // Por ser "responsável" um objeto, não pode retornar uma String..
    // public String getResponsavel() {
    //     return responsavel;
    // }

    public void setResponsavel(Usuario usuario) {
        this.responsavel = usuario;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    // public void setTarefas(ArrayList<Tarefa> tarefas) {
    //     this.tarefas = tarefas;
    // }
    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    // Substitui o método Set pelo método adicionarParticipantes()
    // public void setParticipantes(ArrayList<Usuario> participantes) {
    //     this.participantes = participantes;
    // }
    public void adicionarParticipantes(Usuario usuario) {
        participantes.add(usuario);
    }

    public void adicionarTarefas(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefas(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    // utilizo o Strinbuilder para facilitar a exibição da lista no foreach no método toString
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nID do projeto: ").append(idProjeto);
        sb.append("\nNome: ").append(nome);
        sb.append("\nDescrição: ").append(descricao);
        sb.append("\nData inicial: ").append(dataInicial);
        sb.append("\nData de conclusão: ").append(dataConclusao);
        sb.append("\nStatus: ").append(status);
        sb.append("\nResponsável: ").append(responsavel.getNome());
        sb.append("\n");
        if (tarefas.isEmpty()) {
            sb.append("Não existem tarefas para este projeto!");
        } else {
            for (Tarefa tarefa : tarefas) {
                sb.append("\n" + tarefa);
            }
        }

        return sb.toString();
    }

}
