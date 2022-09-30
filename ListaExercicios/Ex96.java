import java.util.Scanner;

public class Ex96 {
    static double Media (double nota1, double nota2) {
        double res = (nota1 + nota2) / 2;
        return res;
    }

    public static void main(String[] args) {
        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.printf("Media: %.1f", Media(n1, n2));
    }
}
