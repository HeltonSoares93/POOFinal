package Classes;

import prioridadeEnum.Prioridade;
import statusEnum.Status;

public class Tarefa {

    private int idTarefa;
    private String titulo;
    private String descricao;
    private String dataCriacao;
    private String dataConclusao;
    private int idProjeto;

    private Prioridade prioridade;
    private Status status;

    public Tarefa() {
    }

    public Tarefa(int idTarefa, String titulo, String descricao, String dataCriacao, String dataConclusao,
            int idProjeto, Prioridade prioridade, Status status) {
        this.idTarefa = idTarefa;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.idProjeto = idProjeto;
        this.prioridade = prioridade;
        this.status = status;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    // como já existe o método atualizarStatus, não inseri o Set
    // public void setStatus(Status status) {
    //     this.status = status;
    // }
    public void atualizarStatus(Status status) {
        this.status = status;
    }

    public void definirPrazo() {

    }

    public String toString() {
        return "Lista de Tarefas\n\nTarefa: " + getTitulo() + "\nDescrição: " + getDescricao() + "\n Data de Criação: " + getDataCriacao()
                + "\nData de Conclusão: " + getDataConclusao() + "\nPrioridade: " + getPrioridade() + "\nStatus: " + getStatus();
    }

}
