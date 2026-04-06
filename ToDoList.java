 import java.util.ArrayList;
 import java.util.Scanner;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public class Task {
        private String description;
        private boolean completed;
        
        public Task(String description) {
            this.description = description;
            this.completed = false;
        }
        
        public String getDescription() {
            return description;
        }
        
        public boolean isCompleted() {
            return completed;
        }
        
        public void makeCompleted() {
            this.completed = true;
        }
    }
    
    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("✓ Tarefa adicionada: " + description);
    }
    
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada ainda.");
        } else {
            System.out.println("\n=== LISTA DE TAREFAS ===");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "[✓]" : "[ ]";
                System.out.println(i + 1 + ". " + status + " " + task.getDescription());
            }
            System.out.println("========================\n");
        }
    }
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BEM-VINDO AO SEU GERENCIADOR DE TAREFAS ===\n");
        
        while (true) {
            System.out.println("Digite uma tarefa para adicionar à lista (ou 'sair' para encerrar):");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("sair")) {
                System.out.println("\nObrigado por usar o gerenciador de tarefas!");
                toDoList.showTasks();
                break;
            }
            
            if (!input.isEmpty()) {
                toDoList.addTask(input);
            } else {
                System.out.println("Digite algo válido!\n");
            }
        }
        
        scanner.close();
    }
}