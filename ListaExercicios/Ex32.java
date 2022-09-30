import java.util.Random;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(5) + 1;
        System.out.print("Tente acertar o numero (de 1 a 5): ");
        num = s.nextInt();
        System.out.printf("O numero gerado foi %d\n", rand);
        if(num == rand) {
            System.out.println("Parabens voce acertou!");
        }
        else{
            System.out.println("Voce errou");
        }
    }
}
