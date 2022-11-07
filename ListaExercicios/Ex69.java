import java.util.Scanner;
public class Ex69 {
    public static void main(String[] args) {
        int termo, razao, primeiro, soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro termo: ");
        primeiro = scan.nextInt();
        System.out.print("Digite a razão: ");
        razao = scan.nextInt();
        termo = primeiro;

        for(int cont = 1; cont <= 10; cont++) {
            System.out.printf("%d ", termo);
            termo += razao;
            soma += termo;
        }

        System.out.printf("\nSoma dos termos = %d", soma);
    }
}
