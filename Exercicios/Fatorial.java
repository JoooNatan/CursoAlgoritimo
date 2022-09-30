import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int c, n, f = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        n = s.nextInt(); 
        c = n;

        while(c >= 1){
            f = f * c;
            c--;
        }
        System.out.println("O fatorial de " + n + " e " + f);
    }
}
