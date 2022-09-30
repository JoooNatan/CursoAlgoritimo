import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome;

        System.out.print("Ola, qual o seu nome? ");
        nome = s.next();
        System.out.printf("Olá %s, é um prazer te conhecer!", nome);
    }
}
/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/