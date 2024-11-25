package ifma.lista03;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Node adicionarInicio(int element){
        Node novoNode = new Node(element);
        if (isEmpty()){
            head = novoNode;
            tail = novoNode;
            size++;
        } else {
            Node temp = head;
            head = novoNode;
            head.next = temp;
            size++;
        }
        return novoNode;
    }

    public Node adicionarFim(int element){
        Node novoNode = new Node(element);
        if (isEmpty()){
            adicionarInicio(element);
        } else {
            tail.next = novoNode;
            tail = novoNode;
            size++;
        }
        return novoNode;
    }

    public Node removerComeco(){
        if (isEmpty()){
            System.out.println("Lista vazia!");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return temp;
        }
    }

    public Node removerFinal(){
        if (isEmpty()){
            System.out.println("Lista vazia!");
            return null;
        } else {
            Node current = head;
            if (current.next == null){
                head = null;
                tail = null;
                size--;
                return current;
            } else {
                current = current.next;
                Node previous = head;
                while (current.next != null){
                    previous = current;
                    current = current.next;
                }
                previous.next = null;
                tail = previous;
                size--;
                return previous;
            }
        }
    }

    public int maiorValor(){
        int maior = head.element;
        Node temp = head;
        while (temp.next != null){
            if (maior < temp.next.element){
                maior = temp.next.element;
            }
            temp = temp.next;
        }
        return maior;
    }

    public int menorValor(){
        int menor = head.element;
        Node temp = head;
        while (temp.next != null){
            if (menor > temp.next.element){
                menor = temp.next.element;
            }
            temp = temp.next;
        }
        return menor;
    }

    public double mediaValores(){
        int soma = 0;
        Node temp = head;
        while (temp != null){
            soma += temp.element;
            temp = temp.next;
        }
        return (double) soma / size;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[ ]";
        }
        String s = "[" + head.element;

        Node node = head.next;
        while(node != null){
            s += ", " + node.element;
            node = node.next;
        }
        return s + "]";
    }
}
