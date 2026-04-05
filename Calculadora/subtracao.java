// Classe que implementa a operação de SUBTRAÇÃO
public class subtracao implements operacao {
    // Implementa o cálculo: a - b
    @Override
    public double calculo(double a, double b) {
        return a - b;
    }
    
    // Retorna o símbolo da subtração
    @Override
    public String Getsimbolinho() {
        return "-";
    }
}