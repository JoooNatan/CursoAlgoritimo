import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        int anoNasc, idade, tempoRestante, tempoPassado, anoAtual = 2022;
        int cont = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento ");
        anoNasc = s.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println("Idade: " + idade);
        if(idade < 18){
            tempoRestante = 18 - idade;
            System.out.printf("Faltam %d anos para voce se alistar", tempoRestante);
        }
        else{
            tempoPassado = idade - 18;
            System.out.printf("Se passaram %d anos do alistamento", tempoPassado);
        }
    }
}
/*22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento. */