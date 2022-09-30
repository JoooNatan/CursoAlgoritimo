import java.util.Scanner;

public class Idade{
    public static void main(String[] args) {
        int anoNascimento, anoAtual;

        Scanner t1 = new Scanner(System.in);
        System.out.println("Em que ano nos estamos?");
        anoAtual = t1.nextInt();
        
        System.out.println("Em que ano voce nasceu?");
        anoNascimento = t1.nextInt();
        System.out.println("A sua idade é: " + (anoAtual - anoNascimento));
        
    }
}