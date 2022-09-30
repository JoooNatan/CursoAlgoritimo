import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int cont = 1, u;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite ate onde voce quer contar");
        u = s.nextInt();

        while (cont <= u){
            System.out.println(cont);
            cont = cont + 1;
        }
    }
}
