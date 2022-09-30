import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int nums [] = new int[4];
        int totPar = 0;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor");
            nums[i] = s.nextInt();
            if(nums[i] % 2 == 0){
                totPar = totPar + 1;
            }
        }
        System.out.println("Total de numeros pares " + totPar);
    }
}
