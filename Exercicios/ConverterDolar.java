import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterDolar {
    public static void main(String[] args) {
        double real, dolarCotacao;

        Scanner t1 = new Scanner(System.in);
        System.out.println("Digite a cotaçao: ");
        dolarCotacao = t1.nextDouble();

        System.out.println("Digite a quantidade de reais para ser convertido: ");
        real = t1.nextDouble();

        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("o valor convertido e: US$ " + df.format(real / dolarCotacao));
    }
}
