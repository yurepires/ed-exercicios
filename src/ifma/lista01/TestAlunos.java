package ifma.lista01;

public class TestAlunos {
    public static void main(String[] args) {
        //

        CadastrarAlunos escola = new CadastrarAlunos(5);

        escola.adicionarNoInicio(new Aluno(12,"1234","Yure"));
        escola.adicionarNoFinal(new Aluno(11,"1235","Pires"));
        escola.adicionarNoFinal(new Aluno(14,"1236","Gabriel"));
        escola.adicionarNoFinal(new Aluno(9,"1237","Clara"));
        escola.adicionarNoFinal(new Aluno(7,"1233", "Vasconcelos"));

        System.out.println(escola);

        escola.removerNoInicio();
        System.out.println(escola);

        escola.removerNoFinal();
        System.out.println(escola);

        escola.removerComIndice(2);
        System.out.println(escola);

        escola.adicionarNoFinal(new Aluno(8, "1238", "Laura"));
        escola.adicionarNoFinal(new Aluno(6, "1239", "Beatriz"));
        escola.adicionarNoFinal(new Aluno(15, "1240", "Clara"));

        escola.ordenaVetor();
        System.out.println(escola);
    }
}
