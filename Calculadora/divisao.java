// Classe que implementa a operação de DIVISÃO
public class divisao implements operacao {
    // Implementa o cálculo: a / b
    // Valida se o divisor é zero antes de executar
    @Override
    public double calculo(double a, double b) {
        // Previne divisão por zero (erro matemático)
        if (b == 0){
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
    
    // Retorna o símbolo da divisão
    @Override
    public String Getsimbolinho() {
        return "/";
    }
}