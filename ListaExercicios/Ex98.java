import java.util.Scanner;

public class Ex98 {
    static int SuperSomador(int n1, int n2){//Soma os valores no intervalo de n1 ate n2
        int soma = 0;
        for (int c = n1; c <= n2; c++) {
            soma += c;//<-- soma = soma + c;
        }
        return soma;
    }

    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextInt();
        soma = SuperSomador(n1, n2);
        System.out.printf("Resultado: %d", soma);
    }
}
