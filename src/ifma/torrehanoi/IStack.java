package ifma.torrehanoi;

public interface IStack {
    int size();

    boolean isEmpty();

    int top();

    void push(int element);

    int pop();
}
