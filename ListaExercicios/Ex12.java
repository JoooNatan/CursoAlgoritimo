import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        double preco, desconto = 0.05, resut;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto ");
        preco = scan.nextDouble();
        resut = preco - (preco * desconto);
        System.out.println("Preço do produto com 5% de desconto R$" + resut);
    }
}
/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto. */