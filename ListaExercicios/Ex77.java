import java.util.Scanner;

public class Ex77 {
    public static void main(String[] args) {
        String nome[] = new String[7];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome da %d° pessoa ", i + 1);
            nome[i] = input.next();
        }
        for(int i = 6; i >= 0; i--) {
            System.out.printf("\n%s", nome[i]);
        }
    }
}
