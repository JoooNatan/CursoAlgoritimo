import java.util.Scanner;

public class IdadeDirigir {
    public static void main(String[] args) {
        int idade;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = s1.nextInt();

        if(idade >= 18){
            System.out.println("Voce ja pode tirar abilitacao");
        }
        else{
            System.out.println("Voce nao pode tirar abilitacao");
        }
    }
}
