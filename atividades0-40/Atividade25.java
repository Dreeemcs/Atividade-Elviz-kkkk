public class Atividade25 {

    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    static String classificar(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public static void main(String[] args) {
        double imc = calcularIMC(70, 1.75);
        System.out.printf("IMC: %.1f -> %s%n", imc, classificar(imc)); // 22.9 -> Normal
    }
}
