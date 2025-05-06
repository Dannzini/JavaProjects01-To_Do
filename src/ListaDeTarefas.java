import java.util.ArrayList;

public class ListaDeTarefas {

    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas(){
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa nova = new Tarefa (descricao);
        tarefas.add(nova);
    }

    public void listarTarefa(){
        for (int i= 0; i < tarefas.size(); i++){
            System.out.print((i + 1)  + " - ");
            tarefas.get(i).exibir();
        }
    }

    public void removerTarefa(int indice){
        if (indice >=0 && indice < tarefas.size()){
            tarefas.remove(indice);
        } else {
            System.out.print("Indice inválido");
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        } else {
            System.out.println("Indice Inválido");
        }
    }

}
