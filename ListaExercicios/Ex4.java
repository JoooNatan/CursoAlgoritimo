import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2, so;

        System.out.print("Digite um numero: ");
        n1 = s.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = s.nextInt();
        so = n1 + n2;
        System.out.printf("A soma entre %d e %d é: %d", n1, n2, so);
    }
}
/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13. */