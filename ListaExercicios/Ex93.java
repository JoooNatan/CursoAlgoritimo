import java.util.Scanner;

public class Ex93 {
    static void Contador(int inicio, int fim, int passo) {
        for (int c = inicio; c <= fim; c += passo) {
            System.out.printf("%d ", c);
        }
    }

    public static void main(String[] args) {
        int inicio, fim, passo;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o inicio da contagem: ");
        inicio = input.nextInt();
        System.out.print("Digite o fim da contagem: ");
        fim = input.nextInt();
        System.out.print("Digite o passo da contagem: ");
        passo = input.nextInt();
        Contador(inicio, fim, passo);
    }
}
