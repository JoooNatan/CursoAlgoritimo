import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double salario, ajuste = 0.15, resut;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salario paro o reajuste ");
        salario = scan.nextDouble();
        resut = salario + (salario * ajuste);
        System.out.printf("Salario com 15 porcento de aumento R$ %.2f", resut);
    }
}
/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento. */