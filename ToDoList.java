// Importações necessárias para utilizar ArrayList e Scanner
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe ToDoList - Gerenciador de tarefas
 * Permite adicionar tarefas e visualizar a lista de tarefas
 */
public class ToDoList {
    // ArrayList que armazena todas as tarefas
    private ArrayList<Task> tasks;

    /**
     * Construtor da classe ToDoList
     * Inicializa a ArrayList de tarefas vazia
     */
    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Classe interna Task - Representa uma tarefa individual
     * Cada tarefa tem uma descrição e um status de conclusão
     */
    public class Task {
        // Descrição da tarefa
        private String description;
        // Indica se a tarefa foi concluída
        private boolean completed;
        
        /**
         * Construtor da classe Task
         * @param description - A descrição da tarefa a ser criada
         */
        public Task(String description) {
            this.description = description;
            this.completed = false; // Inicia como não concluída
        }
        
        /**
         * Obtém a descrição da tarefa
         * @return A descrição da tarefa
         */
        public String getDescription() {
            return description;
        }
        
        /**
         * Verifica se a tarefa foi concluída
         * @return true se concluída, false caso contrário
         */
        public boolean isCompleted() {
            return completed;
        }
        
        /**
         * Marca a tarefa como concluída
         */
        public void makeCompleted() {
            this.completed = true;
        }
    }
    
    /**
     * Adiciona uma nova tarefa à lista
     * @param description - A descrição da tarefa a ser adicionada
     */
    public void addTask(String description) {
        // Cria uma nova tarefa com a descrição fornecida
        Task newTask = new Task(description);
        // Adiciona a tarefa ao ArrayList
        tasks.add(newTask);
        // Exibe mensagem de confirmação
        System.out.println("✓ Tarefa adicionada: " + description);
    }
    
    /**
     * Exibe todas as tarefas da lista
     * Mostra o status (concluída ou não) de cada tarefa
     */
    public void showTasks() {
        // Verifica se a lista está vazia
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada ainda.");
        } else {
            // Exibe o cabeçalho da lista
            System.out.println("\n=== LISTA DE TAREFAS ===");
            // Itera sobre cada tarefa na lista
            for (int i = 0; i < tasks.size(); i++) {
                // Obtém a tarefa atual
                Task task = tasks.get(i);
                // Define o status: [✓] para concluída, [ ] para não concluída
                String status = task.isCompleted() ? "[✓]" : "[ ]";
                // Exibe a tarefa com seu número, status e descrição
                System.out.println(i + 1 + ". " + status + " " + task.getDescription());
            }
            // Exibe o rodapé da lista
            System.out.println("========================\n");
        }
    }
    /**
     * Método principal (main) - Ponto de entrada do programa
     * Gerencia a interação do usuário com o programa
     */
    public static void main(String[] args) {
        // Cria uma nova instância do gerenciador de tarefas
        ToDoList toDoList = new ToDoList();
        // Cria um Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibe mensagem de boas-vindas
        System.out.println("=== BEM-VINDO AO SEU GERENCIADOR DE TAREFAS ===\n");
        
        // Loop infinito para permitir múltiplas entradas
        while (true) {
            // Solicita entrada do usuário
            System.out.println("Digite uma tarefa para adicionar à lista (ou 'sair' para encerrar):");
            // Lê a entrada do usuário e remove espaços em branco
            String input = scanner.nextLine().trim();
            
            // Verifica se o usuário digitou "sair"
            if (input.equalsIgnoreCase("sair")) {
                // Exibe mensagem de encerramento
                System.out.println("\nObrigado por usar o gerenciador de tarefas!");
                // Exibe todas as tarefas adicionadas
                toDoList.showTasks();
                // Encerra o loop
                break;
            }
            
            // Verifica se a entrada não está vazia
            if (!input.isEmpty()) {
                // Adiciona a tarefa à lista
                toDoList.addTask(input);
            } else {
                // Avisa o usuário se a entrada for vazia
                System.out.println("Digite algo válido!\n");
            }
        }
        
        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}