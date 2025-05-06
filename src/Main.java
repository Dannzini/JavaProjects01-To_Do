import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Concluir tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da Tarefa:  ");
                    String descricao = scanner.nextLine();
                    lista.adicionarTarefa(descricao);
                    break;

                case 2:
                    lista.listarTarefa();
                    break;

                case 3:
                    System.out.println("Digite o indice da tarefa a remover:  ");
                    int indiceRemover = scanner.nextInt()-1;
                    lista.removerTarefa(indiceRemover);
                    break;

                case 4:
                    System.out.println("Digite o indice da tarefa a concluir:  ");
                    int indiceConcluir = scanner.nextInt()-1;
                    lista.concluirTarefa(indiceConcluir);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao != 0);
        scanner.close();
        }
    }
