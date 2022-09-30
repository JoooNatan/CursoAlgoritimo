import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int mat [][] = new int[3][2];
        int totPar = 0;

        Scanner s = new Scanner(System.in);

        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 2; c++){
                System.out.print("Digite um numero ");
                mat[l][c] = s.nextInt();
                if(mat[l][c] % 2 == 0){
                    totPar++;
                }
            }
        }
        //loop for-each
        /*for(int num : nums) {
            System.out.println(num);
            if(num % 2 == 0){
                totPar = totPar + 1;
            }
        }*/
        System.out.println("A quantidade de numeros pares foi de " + totPar);
    }
}
