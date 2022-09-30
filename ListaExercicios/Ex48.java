import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        int nums[] = new int [7];
        Scanner s = new Scanner(System.in);
        int i = 0, soma = 0;

        while(i < nums.length) {
            System.out.printf("Digite o %d° valor ", i + 1);
            nums[i] = s.nextInt();
            soma = soma + nums[i];
            i++;
        }
        System.out.printf("Soma dos numeros: %d", soma);
    }
}
