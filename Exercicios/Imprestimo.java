import java.util.Scanner;
import java.text.DecimalFormat;

public class Imprestimo {
    public static void main (String [] args){
        double juros = 20, valor, valorParcela;
        int quantParcela;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o valor do imprestimo ");
        valor = s1.nextDouble();

        System.out.println("Quantas parcelas?");
        quantParcela = s1.nextInt();

        valor = (valor * juros / 100) + valor;
        valorParcela = (valor / quantParcela);

        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("Valor total com juros: R$" + df.format(valor));
        System.out.println("Terão de ser pagas " + quantParcela + " parcelas de: R$" + df.format(valorParcela));
    }
}
