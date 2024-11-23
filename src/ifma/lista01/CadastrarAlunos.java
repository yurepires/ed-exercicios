package ifma.lista01;

import java.util.Arrays;

public class CadastrarAlunos {
    int quantAlunos;
    Aluno[] alunos;

    public CadastrarAlunos(int tamanho) {
        this.alunos = new Aluno[tamanho];
    }

    private boolean isEmpty(){
        return quantAlunos == 0;
    }

    private boolean isFull(){
        return quantAlunos >= alunos.length;
    }

    public void adicionarNoFinal(Aluno aluno){
        if (isFull()){
            System.out.println("Lista de alunos cheia.");
            return;
        }
        alunos[quantAlunos] = aluno;
        quantAlunos++;
    }

    public void adicionarNoInicio(Aluno aluno){
        if (isFull()) {
            System.out.println("Lista de alunos cheia.");
            return;
        }
        for (int i = quantAlunos; i > 0; i--){
            alunos[i] = alunos[i - 1];
        }
        alunos[0] = aluno;
        quantAlunos++;
    }

    public Aluno removerNoFinal(){
        if (isEmpty()){
            System.out.println("Lista de alunos vazia.");
            return null;
        }

        Aluno ultimoAluno = alunos[quantAlunos - 1];
        alunos[quantAlunos - 1] = null;
        quantAlunos--;
        return ultimoAluno;
    }

    public Aluno removerNoInicio(){
        if (isEmpty()){
            System.out.println("Lista de alunos vazia.");
            return null;
        }
        Aluno primeiroAluno = alunos[0];
        for (int i=0; i < quantAlunos - 1; i++){
            alunos[i] = alunos[i + 1];
        }
        alunos[quantAlunos - 1] = null;
        quantAlunos--;
        return primeiroAluno;
    }

    public boolean verificarIndice(int indice){
        if (isEmpty()){
            System.out.println("Lista de alunos vazia.");
            return false;
        }
        for(int i=0; i < quantAlunos; i++){
            if (i == indice){
                if (alunos[i] != null){
                    return true;
                }
            }
        }
        return false;
    }

    public Aluno removerComIndice(int indice){
        if (isEmpty()){
            System.out.println("Lista de alunos vazia.");
            return null;
        }
        if (!verificarIndice(indice)){
            System.out.println("Indice não encontrado!");
            return null;
        } else {
            if (indice == 0){
                return removerNoInicio();
            } else if (indice == quantAlunos - 1) {
                return removerNoFinal();
            } else {
                Aluno alunoRemovido = alunos[indice];
                for (int i=indice; i < quantAlunos; i++){
                    alunos[i] = alunos[i + 1];
                }
                alunos[quantAlunos - 1] = null;
                quantAlunos--;
                return alunoRemovido;
            }
        }
    }

    public void ordenaVetor(){
        for (int i=0; i < quantAlunos - 2; i++){
            boolean mudou = false;
            for (int r = 0; r < quantAlunos - 1; r++){
                if (alunos[r].getCodigo() > alunos[r + 1].getCodigo()){
                    Aluno temp = alunos[r];
                    alunos[r] = alunos[r + 1];
                    alunos[r + 1] = temp;
                    mudou = true;
                }
            }
            if (!mudou){
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "CadastrarAlunos{" +
                "quantAlunos=" + quantAlunos +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}