package ifma.lista04;

public class Node {
    Aluno dados;
    Node next;
    Node previous;

    public Node(){
    }

    public Node(Aluno aluno) {
        this.dados = aluno;
    }

    @Override
    public String toString() {
        return "{" + dados + '}';
    }
}
