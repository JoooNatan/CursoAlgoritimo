import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        double salario[] = new double[100000];
        double salarioTotalF = 0, salarioTotalM = 0;
        int sexo[] = new int[100000];
        String op = "s";
        int i = 0;
        Scanner s = new Scanner(System.in);

        while (op.charAt(0) == 's') {
            System.out.printf("Digite o salario do %d° funcionario ", i + 1);
            salario[i] = s.nextDouble();
            System.out.print("Digite o sexo (1-feminino/2-masculino) ");
            sexo[i] = s.nextInt();
            if(sexo[i] == 1){
                salarioTotalF = salarioTotalF + salario[i];
            }
            else{
                salarioTotalM = salarioTotalM + salario[i];
            }
            System.out.print("Continuar(s/n)? ");
            op = s.next();
            System.out.print("--------------------------------------\n");
            i++;
        }
        System.out.printf("Salario total pago as mulheres R$%.2f\n", salarioTotalF);
        System.out.printf("Salario total pago aos homens R$%.2f\n", salarioTotalM);
    }
}
