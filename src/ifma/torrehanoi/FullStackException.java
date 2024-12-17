package ifma.torrehanoi;

public class FullStackException extends RuntimeException{
    public FullStackException(){
        super("Pilha cheia!");
    }
}