import java.util.Scanner;

public class Ex94 {
    static void Fibonacci (int quant) {
        int n1 = 0, n2 = 1, n3;

        System.out.printf("%d > ", n2);
        for(int i = 2; i <= quant; i++) {
            n3 = n1 + n2;
            System.out.printf("%d > ", n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.print("FIM");
    }

    public static void main(String[] args) {
        int quant;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        quant = input.nextInt();
        Fibonacci(quant);
    }
}
