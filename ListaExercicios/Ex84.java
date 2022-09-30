import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
        String nome[] = new String[9];
        int idade[] = new int[9];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome da %d° pessoa: ", i + 1);
            nome[i] = input.next();
            System.out.printf("Digite o idade da %d° pessoa: ", i + 1);
            idade[i] = input.nextInt();
        }

        System.out.print("Listagem com as pessoas menores de 18\n");
        for (int i = 0; i < nome.length; i++) {
            if (idade[i] < 18) {
                System.out.printf("\nNome: %s, idade %d anos", nome[i], idade[i]);
            }
        }
    }
}
