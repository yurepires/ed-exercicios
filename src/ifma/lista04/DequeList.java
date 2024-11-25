package ifma.lista04;

public class DequeList {
    Node header;
    Node trailer;
    int size;

    public DequeList(){
        size = 0;
        header = new Node();
        trailer = new Node();
        trailer.previous = header;
        header.next = trailer;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Node addFirst(Aluno novoAluno){
        Node newNode = new Node(novoAluno);
        if (isEmpty()){
            header.next = newNode;
            trailer.previous = newNode;
            newNode.previous = header;
            newNode.next = trailer;
            size++;
            return newNode;
        }
        Node temp = header.next;
        header.next = newNode;
        newNode.previous = header;
        newNode.next = temp;
        temp.previous = newNode;
        size++;
        return newNode;
    }

    public Node addLast(Aluno aluno){
        if (isEmpty()){
            return addFirst(aluno);
        }
        Node newNode = new Node(aluno);
        Node temp = trailer.previous;
        trailer.previous = newNode;
        temp.next = newNode;
        newNode.next = trailer;
        newNode.previous = temp;
        size++;
        return newNode;
    }

    public Node getFirst(){
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return null;
        }
        return header.next;
    }

    public Node getLast(){
        if (isEmpty()){
            System.out.println("Lista vazia!");
            return null;
        }
        return trailer.previous;
    }

    public Node removeFirst(){
        if (isEmpty()){
            System.out.println("Lista vazia!");
            return null;
        }
        Node firstNode = getFirst();
        header.next = firstNode.next;
        firstNode.next.previous = header;
        return firstNode;
    }

    public Node removeLast(){
        if (isEmpty()){
            System.out.println("Lista vazia!");
            return null;
        }
        Node atualUltimo = getLast();
        trailer.previous = atualUltimo.previous;
        atualUltimo.previous.next = trailer;
        return atualUltimo;
    }

    public Node search(String nomeProcurado){
        Node temp = header.next;
        while (temp != trailer){
            if (temp.dados.nome.equalsIgnoreCase(nomeProcurado)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[ ]";
        }
        Node node = header.next;
        String infos = "[" + node.dados;
        while (node.next != trailer){
            node = node.next;
            infos += ", " + node.dados;
        }
        return infos + "]";
    }
}
