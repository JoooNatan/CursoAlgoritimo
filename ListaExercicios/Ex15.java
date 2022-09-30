import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int dia;
        double ganhoEm1Dia = 25 * 8, result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos dias voce trabalhou no mes? ");
        dia = scan.nextInt();
        result = dia * ganhoEm1Dia;
        System.out.printf("O seu salario é de: R$ %.2f", result);
    }
}
/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada. */