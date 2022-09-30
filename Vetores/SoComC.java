import java.util.Scanner;

public class SoComC {
    public static void main(String[] args) {
        String nome;
        String soC [] = new String[5];
        int tot = 0;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < soC.length; i++) {
            System.out.println("Digite seu nome ");
            nome = s.next();
            if(nome.charAt(0) == 'C' || nome.charAt(0) == 'c'){
                soC[tot] = nome;
                tot = tot + 1;
            }
        }
        System.out.println("LISTAGEM FINAL ");

        for(int i = 0; i < tot; i++){
            System.out.println(soC[i]);
        }
    }
}
