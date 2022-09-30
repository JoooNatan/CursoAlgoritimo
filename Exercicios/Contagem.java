import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        int cont = 1, n1 , n2;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero inicial ");
        n1 = s.nextInt();
        System.out.println("Digite o numero finial ");
        n2 = s.nextInt();

        if(n1 < n2){
            System.out.println("----------\nContando\n----------");
            while(cont <= n2){
                System.out.println(cont);
                cont++;
            }
        }
        else{
            System.out.println("----------\nContando\n----------");
            while(n1 >= cont){
                System.out.println(n1);
                n1 = n1 - 1;
            }
        }
    }
}
