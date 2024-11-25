package ifma.lista03;

public class Node {
    int element;
    Node next;

    public Node(int element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
