import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        int num = 0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para a tabuada dele ser exibida ");
        num = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.printf("\n%d x %d = %d", num, i, result);
        }
    }
}
