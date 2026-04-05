// Classe que implementa a operação de MULTIPLICAÇÃO
public class multiplicacao implements operacao {
    // Implementa o cálculo: a * b
    @Override
    public double calculo(double a, double b){
        return a * b;
    }
    
    // Retorna o símbolo da multiplicação
    @Override
    public String Getsimbolinho() {
        return "*";
    }
}