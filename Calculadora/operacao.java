// Interface que define o contrato para todas as operações matemáticas
// Toda operação (soma, subtração, multiplicação, divisão) deve implementar esses métodos
public interface operacao {
    // Executa o cálculo com dois números
    double calculo(double a, double b);
    
    // Retorna o símbolo da operação (ex: "+", "-", "*", "/")
    String Getsimbolinho();
}