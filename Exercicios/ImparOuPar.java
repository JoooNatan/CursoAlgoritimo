import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        num = s.nextInt();

        if(num % 2 == 0) {
            System.out.println("O numero " + num + " é par");
        }
        else{
            System.out.println("O numero " + num + " é impar");
        }
    }
}
