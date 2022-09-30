import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        String nome;
        double salario;
        int ano;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome ");
        nome = s.next();
        System.out.print("Digite seu salario ");
        salario = s.nextDouble();
        System.out.print("Digite a quantos anos voce trabalha na empresa ");
        ano = s.nextInt();

        if(ano < 3){
            salario = (salario * 0.03) + salario;
        }
        else if(ano >= 3 && ano <= 10){
            salario = (salario * 0.125) + salario;
        }
        else{
            salario = (salario * 0.20) + salario;
        }
        System.out.printf("Salario com reajuste: R$%.2f", salario);
    }
}
/*29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20% */