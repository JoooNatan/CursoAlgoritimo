import java.text.DecimalFormat;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        double valorProduto, imposto;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o valor do produto ");
        valorProduto = s1.nextDouble();

        System.out.println("Digite a porcentagem do imposto");
        imposto = s1.nextDouble();

        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("O valor do produto com imposto é: R$" + df.format((valorProduto * imposto / 100) + valorProduto));
    }
}
