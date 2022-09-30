import java.util.Scanner;

public class Ex100 {
    static double Media (double nota1, double nota2) {
        double res = (nota1 + nota2) / 2;
        return res;
    }

    static String Situacao(double res) {
        if (res <= 5) {
            return "Reprovado";
        } else if (res > 5 && res < 7) {
            return "Recuperação";
        } else {
            return "Aprovado";
        }
    }

    public static void main(String[] args) {
        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.printf("Media: %.1f", Media(n1, n2));
        System.out.printf("\nSituação: %s", Situacao(Media(n1, n2)));
    }
}
/*100) Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media(). */