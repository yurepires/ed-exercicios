package ifma.lista04;

public class TestDequeList {
    public static void main(String[] args) {
        DequeList dequeList = new DequeList();

        dequeList.addFirst(new Aluno("Yure", 9, 9));
        dequeList.addFirst(new Aluno("Alan", 9, 9));
        dequeList.addFirst(new Aluno("Williams", 9, 9));
        dequeList.addLast(new Aluno("Bruno", 9, 9));
        dequeList.addLast(new Aluno("Diogo", 9, 9));
        dequeList.addLast(new Aluno("João Paulo", 9, 9));
        System.out.println("Lista criada: ");
        System.out.println(dequeList);
        System.out.println();

        System.out.println("getFirst e getLast: ");
        System.out.println(dequeList.getFirst());
        System.out.println(dequeList.getLast());
        System.out.println();


        System.out.println("removeFirst e removeLast: ");
        dequeList.removeFirst();
        dequeList.removeLast();
        System.out.println(dequeList);
        System.out.println();


        System.out.println("search: ");
        System.out.println(dequeList.search("yuRe"));
    }
}
