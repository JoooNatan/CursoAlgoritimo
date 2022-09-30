import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double num;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = s.nextDouble();
        System.out.printf("O dobro de %.1f é: %.1f\n", num, num * 2);
        System.out.printf("A terça parte de %.1f é: %.1f", num, num / 3);
    }
}
/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */