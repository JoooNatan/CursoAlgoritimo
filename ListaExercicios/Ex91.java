import java.util.Scanner;

public class Ex91 {
    static String Maior(int n1, int n2) {
        if (n1 > n2) {
            return "Primeiro valor é o maior";
        } else if (n1 < n2) {
            return "Primeiro valor é o menor";
        } else {
            return "Os valores são iguais";
        }
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextInt();
        System.out.printf("Resultado: %s", Maior(n1, n2));
    }
}
