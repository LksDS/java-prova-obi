import java.util.Arrays;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        int[][] matriz;
        Scanner scan = new Scanner(System.in);
        int lado = scan.nextInt();
        int passos = scan.nextInt();
        matriz = new int[lado][lado];
        scan.nextLine();
        for (int i = 0; i < lado; i++){
            char[] linha = scan.nextLine().toCharArray();
            for (int j = 0; j < linha.length;j++){
                matriz[i][j] = Integer.parseInt(Character.toString(linha[j]));
            }
        }

        for (int z = 0; z < passos;z++){
            int[][] newMatriz = new int[matriz.length][matriz.length];
            for (int i = 0; i < matriz.length;i++){
                for (int j = 0; j < matriz[i].length; j++) {
                    newMatriz[i][j] = (matriz[i][j] == 0) ? verifyCelulaViva(matriz,i,j):verifyCelularMorta(matriz,i,j);
                }
            }
            matriz = newMatriz;
        }
        printTable(matriz);

    }

    static int verifyCelulaViva(int[][] matriz, int linha, int coluna){
        int vivasAdjacentes = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                try {
                    if (!(x == 1 && y == 1)){
                        if (matriz[linha - 1 + x][coluna - 1 + y] == 1) {
                            vivasAdjacentes++;
                        }
                    }
                } catch (Exception e) {

                }
            }
        }
        return vivasAdjacentes == 3 ? 1:0;
    }
    static int verifyCelularMorta(int[][] matriz, int linha, int coluna){
        int vivasAdjacentes = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                try {
                    if (!(x == 1 && y == 1)) {
                        if (matriz[linha - 1 + x][coluna - 1 + y] == 1) {
                            vivasAdjacentes++;
                        }
                    }
                } catch (Exception e) {

                }
            }
        }
        return (vivasAdjacentes == 3||vivasAdjacentes == 2) ? 1 : 0;
    }
    static void printTable(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
