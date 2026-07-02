public class Main {
    public static void main(String[] args) {
        // Exercício 1: ao menos 5 objetos Funcionario
        Funcionario[] firma = new Funcionario[5];
        firma[0] = new Funcionario("Ana", "Gerente", 5500.0);
        firma[1] = new Funcionario("Bruno", "Analista", 3800.0);
        firma[2] = new Funcionario("Carla", "Estagiária", 1200.0);
        firma[3] = new Funcionario("Diego", "Desenvolvedor", 4700.0);
        firma[4] = new Funcionario("Elisa", "Suporte", 2600.0);

        System.out.println("=== Funcionários da Firma ===");
        for (Funcionario f : firma) {
            System.out.println(f);
        }

        // Exercício 2: ao menos 6 objetos Produto
        Produto[] almoxarifado = new Produto[6];
        almoxarifado[0] = new Produto("Caneta", 2.5, 100);
        almoxarifado[1] = new Produto("Caderno", 15.0, 40);
        almoxarifado[2] = new Produto("Mouse", 45.0, 20);
        almoxarifado[3] = new Produto("Teclado", 90.0, 15);
        almoxarifado[4] = new Produto("Monitor", 650.0, 8);
        almoxarifado[5] = new Produto("Cabo HDMI", 25.0, 30);

        System.out.println("\n=== Produtos do Almoxarifado ===");
        for (Produto p : almoxarifado) {
            System.out.println(p);
        }

        // Turma de Aluno, usando os métodos set/get
        Aluno[] turma = new Aluno[3];
        turma[0] = new Aluno("João", 18, 8.5, "TADS", 'A');
        turma[1] = new Aluno("Maria", 19, 7.2, "TADS", 'B');
        turma[2] = new Aluno("Pedro", 20, 9.1, "TADS", 'A');

        System.out.println("\n=== Turma de Alunos ===");
        for (Aluno a : turma) {
            System.out.println(a);
        }

        // Exemplo de uso dos métodos set/get individualmente
        turma[1].setMedia(8.0);
        System.out.println("\nMédia atualizada de " + turma[1].getNome()
                + ": " + turma[1].getMedia());
    }
}
