import java.util.Scanner;

public class MatrizSoma {
    public static void main(String[] args) {
        int m [][] = new int [3][3];
        int somaDiagonal = 0;
        int produtoL2 = 1;
        int maiorValorC3 = 0;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Digite um numero ");
                m [i][j] = s.nextInt();
                if(i == j){
                    somaDiagonal = somaDiagonal + m [i][j];
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
        for(int i = 0; i < 3; i++) {
            produtoL2 = produtoL2 * m [1][i];
        }
        for(int i = 0; i < 3; i++) {
            if(m [i][2] > maiorValorC3){
                maiorValorC3 = m [i][2];
            }
        }
        System.out.println("Soma dos numeros na diagonal principal: " + somaDiagonal);
        System.out.println("Produto da segunda linha: " + produtoL2);
        System.out.println("Maior valor na coluna 3: " + maiorValorC3);
    }
}
