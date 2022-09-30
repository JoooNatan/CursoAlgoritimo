import java.util.Scanner;

public class SuperContador {
    public static void main(String[] args) {
        int opcao, cont1 = 1, cont2 = 10;

        Scanner s = new Scanner(System.in);
        System.out.println("[1] De 1 a 10\n[2] De 10 a 1\n[3] Sair");
        opcao = s.nextInt();

        switch(opcao){
            case 1:
                while(cont1 <= 10){
                    System.out.print(cont1 + " ");
                    cont1++;
                }
                break;
            case 2:
                while(cont2 >= 1){
                    System.out.print(cont2 + " ");
                    cont2--;
                }
        }
    }
}
