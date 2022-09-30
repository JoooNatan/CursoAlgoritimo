import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero ");
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.printf("O numero %d é par", num);
        }
        else{
            System.out.printf("O numero %d é impar", num);
        }
    }
}
/*20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR. */