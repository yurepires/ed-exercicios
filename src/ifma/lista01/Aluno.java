package ifma.lista01;

public class Aluno {
    private int codigo;
    private String matricula;
    private String nome;

    public Aluno(int codigo, String matricula, String nome) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
