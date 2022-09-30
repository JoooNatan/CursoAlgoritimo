import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        String nome;
        int sexo;
        double valorCompra, descontoM = 0.05, descontoF = 0.13;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome ");
        nome = s.next();
        System.out.print("Digite seu sexo [1/2](sendo 1 para feminino e 2 para masculino) ");
        sexo = s.nextInt();
        System.out.print("Digite o valor da compra ");
        valorCompra = s.nextDouble();

        if(sexo == 1){
            valorCompra = valorCompra - (valorCompra * descontoF);
            System.out.printf("Valor da compra com desconto R$%.2f", valorCompra);
        }
        else{
            valorCompra = valorCompra - (valorCompra * descontoM);
            System.out.printf("Valor da compra com desconto R$%.2f", valorCompra);
        }
    }
}
/*23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto */