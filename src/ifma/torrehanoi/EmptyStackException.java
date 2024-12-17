package ifma.torrehanoi;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super("Pilha vazia!");
    }
}