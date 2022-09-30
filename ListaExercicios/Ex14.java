import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int dia, km;
        double precoDia = 90, precoKm = 0.20, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("CARRO ALUGADO\n-----------------------\n");
        System.out.print("Quantos km foram percoridos? ");
        km = scan.nextInt();
        System.out.print("Quantos dias de uso? ");
        dia = scan.nextInt();
        result = (km * precoKm) + (dia * precoDia);
        System.out.printf("O preço pelo aluguel do carro é: R$%.2f", result);
    }
}
/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */