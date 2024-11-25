package ifma.lista03;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList listaSimples = new SimpleList();

        listaSimples.adicionarInicio(10);
        listaSimples.adicionarInicio(8);
        listaSimples.adicionarInicio(9);
        listaSimples.adicionarFim(7);
        listaSimples.adicionarFim(11);
        System.out.println(listaSimples);


        listaSimples.removerComeco();
        System.out.println(listaSimples);

        listaSimples.removerFinal();
        System.out.println(listaSimples);

        System.out.println(listaSimples.menorValor());
        System.out.println(listaSimples.maiorValor());
        System.out.println(listaSimples.mediaValores());
    }
}
