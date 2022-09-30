import java.util.Scanner;

public class Ex97 {
    static int Maior(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        n3 = input.nextInt();
        System.out.printf("O maior numero é: %s", Maior(n1, n2, n3));
    }
}
