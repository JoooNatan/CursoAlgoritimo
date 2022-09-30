import java.util.Scanner;

public class Ex92 {
    static String ParOuImpar(int num) {
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero ");
        num = input.nextInt();
        System.out.printf("O numero é: %s", ParOuImpar(num));
    }
}
