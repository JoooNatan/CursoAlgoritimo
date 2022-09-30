import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int anoNasc, anoAtual = 2022;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento ");
        anoNasc = scan.nextInt();
        anoNasc = anoAtual - anoNasc;
        System.out.printf("Sua idade é: %d anos\n", anoNasc);
        if(anoNasc > 16){
            System.out.print("Voce ja pode votar!");
        }
        else{
            System.out.print("Voce ainda nao pode votar!");
        }
    }
}
/*18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar. */