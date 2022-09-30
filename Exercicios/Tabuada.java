import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int cont = 1, n;

        Scanner s = new Scanner(System.in);
        System.out.println("Quer ver a tabuada de qual numero?");
        n = s.nextInt();

        while(cont <= 10){
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }
    }
}
