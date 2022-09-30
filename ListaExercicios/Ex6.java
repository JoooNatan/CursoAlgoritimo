import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = s.nextInt();
        System.out.printf("O antecessor de %d é: %d\n", num, num - 1);
        System.out.printf("O sucessor de %d é: %d", num, num + 1);
    }
}
/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */