import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome;
        double salario;

        System.out.print("Nome do funcionario: ");
        nome = s.next();
        System.out.print("Salario: ");
        salario = s.nextDouble();
        System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.", nome, salario);
    }
}
/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/