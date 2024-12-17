package ifma.torrehanoi;

public class TorreHanoi {
    VectorStack haste1 = new VectorStack(5);
    VectorStack haste2 = new VectorStack(5);
    VectorStack haste3 = new VectorStack(5);

    public TorreHanoi() {
        inicializaPilha();
    }

    public void inicializaPilha(){
        for (int i=5; i > 0; i--){
            haste1.push(i);
        }
    }

    public boolean isLower(VectorStack hasteA, VectorStack hasteB){
        if (hasteB.isEmpty()){
            return true;
        }
        return hasteA.top() < hasteB.top();
    }

    public void imprimeHastes(){
        VectorStack[] hastes = {haste1, haste2, haste3};
        System.out.println("---------------------------------------------------------------------");
        System.out.println("A   B   C");
        for (int i=4; i > -1; i--){
            for (int r=0; r < 3; r++){
                System.out.printf("%s   ", (hastes[r].discos[i] == 0) ? "|" : hastes[r].discos[i]);
            }
            System.out.println();
        }
    }

    public boolean validaHasteDigitada(String haste){
        return haste.equalsIgnoreCase("A") || haste.equalsIgnoreCase("B") || haste.equalsIgnoreCase("C");
    }

    public VectorStack defineHaste(String haste){
        if (haste.equalsIgnoreCase("A")){
            return haste1;
        } else if (haste.equalsIgnoreCase("B")){
            return haste2;
        } else if (haste.equalsIgnoreCase("C")){
            return haste3;
        } else {
            return null;
        }
    }

    public void moveDisco(String haste1, String haste2){
        VectorStack hasteAtual = defineHaste(haste1);
        VectorStack hasteDestino = defineHaste(haste2);
        if (!hasteAtual.isEmpty()){
            if (isLower(hasteAtual, hasteDestino)){
                hasteDestino.push(hasteAtual.pop());
            } else {
                System.out.printf("O disco %d da haste %s é maior que o disco %d da haste %s\n", hasteAtual.top(), haste1, hasteDestino.top(), haste2);
            }
        } else {
            System.out.printf("A haste %s está vazia!\n", haste1);
        }
    }

    public boolean verificaJogadorGanhou(){
        return haste3.size == 5;
    }
}
