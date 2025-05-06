import java.lang.reflect.Constructor;
import java.sql.SQLOutput;

public class Tarefa {

    String descricao;
    private boolean concluida;

    // Construtor Cheio
    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida(){
        this.concluida = true;
    }

    public void exibir(){
        String status = concluida ? "[X]" : "[]";
        System.out.println(status + " " + descricao);
    }
}
