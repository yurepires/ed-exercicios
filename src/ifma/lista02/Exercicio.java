package ifma.lista02;

public class Exercicio {

    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matriz2 = {{1,2}, {3, 4}, {5, 6}};

        q18(matriz2);
//        System.out.println(q12(matriz1));
    }

    public static void q01(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (matriz[i][r] != matriz[i][i]){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static void q02(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r != (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static void q03(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r == (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static int q04(int[][] matriz){
        int soma = 0;
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r == (matriz[i].length - 1) - i){
                    soma += matriz[i][r];
                }
            }
        }
        return soma;
    }

    public static void q05(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r >= (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static double q06(int[][] matriz){
        int soma = 0;
        int qtd = 0;

        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r >= (matriz[i].length - 1) - i){
                    soma += matriz[i][r];
                    qtd++;
                }
            }
        }

        return (double) soma / qtd;
    }

    public static void q07(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r > (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static int q08(int[][] matriz){
        int maior = 0;
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r > (matriz[i].length - 1) - i){
                    if (maior < matriz[i][r]){
                        maior = matriz[i][r];
                    }
                }
            }
        }
        return maior;
    }

    public static void q09(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r <= (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static int q10(int[][] matriz){
        int menor = matriz[0][0];
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r <= (matriz[i].length - 1) - i){
                    if (menor > matriz[i][r]){
                        menor = matriz[i][r];
                    }
                }
            }
        }
        return menor;
    }

    public static void q11(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r < (matriz[i].length - 1) - i){
                    System.out.printf("%d ", matriz[i][r]);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    public static int q12(int[][] matriz){
        int mult = 1;
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (r < (matriz[i].length - 1) - i){
                    mult *= matriz[i][r];
                }
            }
        }
        return mult;
    }

    public static void q13(int[][] matriz){
        int[][] matrizB = new int[3][3];
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                if (matriz[i][r] % 2 == 0){
                    matrizB[i][r] = matriz[i][r] * matriz[i][r];
                    System.out.printf("%d ", matrizB[i][r]);
                } else {
                    matrizB[i][r] = matriz[i][r] * matriz[i][r] * matriz[i][r];
                    System.out.printf("%d ", matrizB[i][r]);
                }
            }
            System.out.println();
        }
    }

    public static int[][] giraMatriz(int[][] matriz){
        int[][] matrizB = new int[3][3];
        //transposta
        for (int i = 0; i < matriz.length; i++){
            for (int r = 0; r < matriz.length; r++){
                matrizB[r][i] = matriz[i][r];
            }
        }
        //troca as posicoes
        for (int i=0; i < matrizB.length; i++){
            int temp = matrizB[i][0];
            matrizB[i][0] = matrizB[i][matrizB.length - 1];
            matrizB[i][matrizB.length - 1] = temp;
        }
        return matrizB;
    }

    public static void q14(int[][] matriz){
        int[][] matrizB = giraMatriz(matriz);
        for (int i=0; i < matrizB.length; i++){
            for (int r = 0; r < matrizB[i].length; r++){
                System.out.printf("%d ", matrizB[i][r]);
            }
            System.out.println();
        }
    }

    public static void q15(int[][] matriz){
        int[][] matrizB;
        matrizB = matriz;
        for (int i=0; i < 2; i++){
            matrizB = giraMatriz(matrizB);
        }
        for (int i=0; i < matrizB.length; i++){
            for (int r = 0; r < matrizB[i].length; r++){
                System.out.printf("%d ", matrizB[i][r]);
            }
            System.out.println();
        }
    }

    public static void q16(int[][] matriz){
        int[][] matrizB = matriz;
        for (int i=0; i < 3; i++){
            matrizB = giraMatriz(matrizB);
        }
        for (int i=0; i < matrizB.length; i++){
            for (int r = 0; r < matrizB[i].length; r++){
                System.out.printf("%d ", matrizB[i][r]);
            }
            System.out.println();
        }
    }

    public static void q17(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int r=0; r < matriz[i].length; r++){
                System.out.printf("%s ", (r == 1 ? " " : matriz[i][r]));
            }
            System.out.println();
        }
    }

    public static void q18(int[][] matriz){
        int[][] cTransposta = new int[2][3];
        for (int i = 0; i < matriz.length; i++){
            for (int r = 0; r < matriz[i].length; r++){
                cTransposta[r][i] = matriz[i][r];
            }
        }
        for (int i=0; i < cTransposta.length; i++){
            for (int r = 0; r < cTransposta[i].length; r++){
                System.out.printf("%d ", cTransposta[i][r]);
            }
            System.out.println();
        }
    }
}// Fim da classe
