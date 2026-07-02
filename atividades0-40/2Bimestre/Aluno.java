public class Aluno {
    private String nome;
    private int idade;
    private double media;
    private String curso;
    private char conceito;

    public Aluno(String nome, int idade, double media, String curso, char conceito) {
        this.nome = nome;
        this.idade = idade;
        this.media = media;
        this.curso = curso;
        this.conceito = conceito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getConceito() {
        return conceito;
    }

    public void setConceito(char conceito) {
        this.conceito = conceito;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Idade: " + idade + " | Média: " + media
                + " | Curso: " + curso + " | Conceito: " + conceito;
    }
}
