import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String [] args) {
        int a, b;
        Random num = new Random();
        Scanner S1 = new Scanner(System.in);
        System.out.println("1-para fazer\n2-sair");
        int opcao = S1.nextInt();
        if(opcao == 1){
            a = num.nextInt(6) + 1;
            b = num.nextInt(6) + 1;
            System.out.println("Dado A: " + a);
            System.out.println("Dado B: " + b);
            System.out.println("Soma de A e B: " + (a + b));
        }
        else{}
    }
}
