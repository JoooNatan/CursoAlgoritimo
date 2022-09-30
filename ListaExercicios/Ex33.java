import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        double valorCasa, salario, valorPrestacao;
        int anosDePagamento;
        Scanner s = new Scanner(System.in);

        System.out.print("----------------EMPRESTIMO----------------\n");
        System.out.print("Qual o valor da casa? ");
        valorCasa = s.nextDouble();
        System.out.print("Qual o seu salario mensal? ");
        salario = s.nextDouble();
        System.out.print("Em quantos anos voce pretende pagar? ");
        anosDePagamento = s.nextInt();
        valorPrestacao = (valorCasa / anosDePagamento) / 12;
        if(valorPrestacao < 0.30 * salario) {
            System.out.print("Status do imprestimo: APROVADO\n");
            System.out.printf("O valor mensal sera de R$%.2f", valorPrestacao);
        }
        else{
            System.out.print("Status do imprestimo: REPROVADO");
        }
    }
}
