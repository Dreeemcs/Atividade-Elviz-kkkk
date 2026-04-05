// Calculadora.java
// Classe principal que gerencia todas as operações matemáticas
// Usa padrão Strategy com HashMap para registrar operações dinamicamente
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class calculadora {

    private List<String> historico;      // Armazena todas as operações realizadas
    private Map<String, operacao> operacoes; // Mapeia símbolos ("|", "-", etc) para suas implementações

    // Construtor: inicializa e registra todas as operações disponíveis
    public calculadora() {
        this.historico = new ArrayList<>();
        this.operacoes = new HashMap<>();

        // Registra as operações disponíveis mapeando pelo símbolo
        registrarOperacao(new soma());           // +
        registrarOperacao(new subtracao());      // -
        registrarOperacao(new multiplicacao());  // *
        registrarOperacao(new divisao());        // /
    }

    // Permite adicionar novas operações facilmente (padrão Strategy)
    // Exemplo: registrarOperacao(new raizQuadrada());
    public void registrarOperacao(operacao op) {
        operacoes.put(op.Getsimbolinho(), op);
    }

    // Executa cálculo e registra no histórico
    public double calcular(double a, double b, String simbolo) {
        // Normaliza símbolo: aceita ÷ como alias para /
        String simboloNormalizado = simbolo;
        if ("÷".equals(simbolo)) {
            simboloNormalizado = "/";
        }

        // Busca a operação no mapa de operações registradas
        operacao op = operacoes.get(simboloNormalizado);

        // Valida se operação existe
        if (op == null) {
            throw new IllegalArgumentException("Operação desconhecida: " + simbolo);
        }

        // Executa o cálculo e armazena no histórico
        double resultado = op.calculo(a, b);
        String entrada = String.format("%.2f %s %.2f = %.2f", a, simbolo, b, resultado);
        historico.add(entrada);

        return resultado;
    }

    // Exibe todas as operações realizadas no histórico
    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
            return;
        }
        System.out.println("=== Histórico ===");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println((i + 1) + ". " + historico.get(i));
        }
    }

    // Limpa o histórico de operações
    public void limpar() {
        historico.clear();
        System.out.println("Histórico limpo!");
    }

    // Retorna cópia do histórico (encapsulamento: protege a lista interna)
    public List<String> getHistorico() {
        return new ArrayList<>(historico);
    }
}