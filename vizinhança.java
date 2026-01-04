package exercicios;
import java.util.Scanner;
public class vizinhança {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int matrix[][] = new int [n][n];

        if (n >= 2) {

            for (int l = 0; l < matrix.length; l++) {
                for (int c = 0; c < matrix[l].length; c++) {
                    matrix[l][c] = teclado.nextInt();
                }
        }
        }

     else {
            System.out.println("a matrix tem que ser maior ou = 2, digite outro valor: ");
        }

        if (n >= 2) {
            System.out.println("digite dois valores seguidos para pegar a posição de um numero: ");
            int posicaoLinha = teclado.nextInt();
            int posicaoColuna = teclado.nextInt();
            System.out.println("valor: " + matrix[posicaoLinha][posicaoColuna]);
            if (posicaoLinha > 0) {
                System.out.println("Acima:" + matrix[posicaoLinha -1][posicaoColuna]);
            }
            if (posicaoLinha < n -1) {
                 System.out.println("Abaixo:" + matrix[posicaoLinha + 1][posicaoColuna]);
            }
            if (posicaoColuna > 0) {
                System.out.println("Esquerda: " + matrix[posicaoLinha][posicaoColuna -1]);

            }
            if (posicaoColuna < n -1) {
                System.out.println("Direita:" + matrix[posicaoLinha][posicaoColuna + 1]);
            }

        }              
            }
        }

