
import Classes.Projeto;
import Classes.Tarefa;
import Classes.Usuario;
import prioridadeEnum.Prioridade;
import statusEnum.Status;
import statusUserEnum.StatusUsuario;

public class AppTeste {

    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario(991, "helton soares", "programador", "helton2009@gmail.com", "****", "04/02/1993", StatusUsuario.ATIVO);

        Projeto projeto = new Projeto(7814, "Gerenciamento de dados", "Sistema de gerenciamento geral de dados", "14/10/2025", "31/10/2025", usuario);

        Tarefa tarefa = new Tarefa(123456, "Elaborar planilha", "Desenvolver memória de cálculo", "14/10/2025", "17/10/2025", 5522, Prioridade.MEDIA, Status.FAZENDO);

        Tarefa tarefa2 = new Tarefa(45812, "Cotação de preços", "Pesquisa de preços com fornecedores", "15/10/2025", "25/10/2025", 991, Prioridade.ALTA, Status.PENDENTE);

        projeto.adicionarParticipantes(usuario);
        projeto.adicionarTarefas(tarefa);
        projeto.adicionarTarefas(tarefa2);
        usuario.atribuirProjeto(projeto);

        IO.print(usuario);

    }
}
