// Classe que implementa a operação de SOMA
public class soma implements operacao {
    // Implementa o cálculo: a + b
    @Override
    public double calculo(double a, double b) {
        return a + b;
    }
    
    // Retorna o símbolo da soma
    @Override
    public String Getsimbolinho() {
        return "+";
    } 
}