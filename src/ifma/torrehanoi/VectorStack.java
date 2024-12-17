package ifma.torrehanoi;

public class VectorStack implements IStack {
    int capacidade;

    public int[] discos;

    int size = 0;

    public VectorStack(int capacidade) {
        this.capacidade = capacidade;
        discos = new int[capacidade];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int top() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return discos[size - 1];
    }

    @Override
    public void push(int element) {
        if (size == capacidade){
            throw new FullStackException();
        }

        discos[size] = element;
        size++;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int temp = top();
        discos[size - 1] = 0;
        size--;
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        if (size > 0) {
            for (int i = 0; i < size(); i++) {
                if (discos[i] != top())
                    s.append(discos[i]).append(", ");
                else
                    s.append(discos[i]);
            }
        }
        return s + "]";
    }
}