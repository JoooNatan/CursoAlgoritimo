import java.util.Random;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        int num, i = 0;
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        while (i < 4){
            int rand = r.nextInt(10) + 1;
            System.out.printf("Tentativa %d\n", i + 1);
            System.out.print("Tente acertar o numero (de 1 a 10): ");
            num = s.nextInt();
            System.out.printf("O numero gerado foi %d\n", rand);
            if(num == rand) {
                System.out.println("Parabens voce acertou!");
                break;
            }
            else{
                System.out.println("Voce errou\n------------------------");
            }
            i++;
        }
    }
}
