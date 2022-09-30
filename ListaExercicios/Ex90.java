import java.util.Scanner;

public class Ex90 {
    static void Somar(int n1, int n2) {
        System.out.printf("Resultado: %d", (n1 + n2));
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextInt();
        Somar(n1, n2);
    }
}
