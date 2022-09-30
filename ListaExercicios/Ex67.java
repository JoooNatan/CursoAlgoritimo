import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite um numero inteiro ");
        num = input.nextInt();
        for(int i = 0; i <= num; i++){
            System.out.print(i + ", ");
        }
        System.out.print("FIM!");
    }
}
