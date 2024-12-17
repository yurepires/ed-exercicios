package ifma.torrehanoi;

import java.util.Scanner;

public class TestTorreHanoi {
    public static void main(String[] args) {
        TorreHanoi jogo = new TorreHanoi();

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Bem vindo ao jogo: Torre de Hanoi!");
        System.out.println("Você deve mover os 5 discos da Haste A até a haste C.");
        System.out.println("Mas atenção para as regras:");
        System.out.println("1 - Você só pode movimentar um disco por vez.");
        System.out.println("2 - Uma peça maior não pode ficar em cima de outra menor.");
        System.out.println("3 - Não é permitido movimentar uma peça que esteja abaixo de outra.");
        System.out.println("\nBom jogo!\n");
        while (true){
            jogo.imprimeHastes();
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Digite a haste que você deseja movimentar o disco do topo e a haste de destino do disco (ex.: A C): ");
            String hasteAtual = scanner.next();
            String hasteDestino = scanner.next();
            while (true){
                if (jogo.validaHasteDigitada(hasteAtual) && jogo.validaHasteDigitada(hasteDestino)){
                    break;
                } else {
                    System.out.println("Você digitou alguma haste inválida! As hastes válidas são: A, B ou C.");
                    System.out.print("Digite a haste que você deseja movimentar o disco do topo e a haste de destino do disco (ex.: A C): ");
                    hasteAtual = scanner.next();
                    hasteDestino = scanner.next();
                }
            }
            jogo.moveDisco(hasteAtual, hasteDestino);
            if (jogo.verificaJogadorGanhou()){
                jogo.imprimeHastes();
                System.out.println("\n---------------------------------------------\nVOCÊ GANHOUU!!!\n---------------------------------------------");
                break;
            }
        }
    }
}
