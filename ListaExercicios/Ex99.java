import java.util.Scanner;

public class Ex99 {
    public static int Potencia(int base, int expoente) {
        int res;
        res = (int) Math.pow(base, expoente);
        return res;
    }

    public static void main(String[] args) {
        int base, expoente;
        int res;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = input.nextInt();
        System.out.print("Digite o expoente: ");
        expoente = input.nextInt();
        res = Potencia(base, expoente);
        System.out.printf("Resultado: %d", res);
    }
}
