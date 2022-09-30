import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        int i = 0, soma = 0;
        boolean op = true;
        int num[] = new int[10000];
        Scanner s = new Scanner(System.in);

        while (op == true){
            System.out.print("Digite um numero ");
            num[i] = s.nextInt();
            if(num[i] == 1111){
                op = false;
            }
            else{
                soma = soma + num[i];
            }
            i++;
        }
        System.out.printf("Soma dos numeros: %d", soma);
    }
}
