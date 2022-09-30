import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        int num, i = 1;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero inteiro e positivo ");
        num = s.nextInt();
        while (i <= num){
            System.out.print(" " + i);
            i++;
        }
        System.out.print(" Acabou!");
    }
}
