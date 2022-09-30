import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
        String nome[] = new String[5];
        int sexo[] = new int[5];
        double salario[] = new double[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("-----------Funcionario %d-----------", i + 1);
            System.out.printf("\nNome: ");
            nome[i] = input.next();
            System.out.printf("Sexo(1-Masculino/2-Feminino): ");
            sexo[i] = input.nextInt();
            System.out.printf("Salario: ");
            salario[i] = input.nextDouble();
        }

        System.out.printf("--------Listagem--------\n");
        for (int i = 0; i < nome.length; i++) {
            if (sexo[i] == 2 && salario[i] > 5000) {
                System.out.printf("\nNome: %s\nSalario: %.2f", nome[i], salario[i]);
            }
        }
    }
}
