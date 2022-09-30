import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        double real, dolarCotacao = 3.45;

        Scanner t1 = new Scanner(System.in);

        System.out.println("Digite a quantidade de reais para ser convertido: ");
        real = t1.nextDouble();

        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("o valor convertido e: US$ " + df.format(real / dolarCotacao));
    }
}
/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */