import java.util.Scanner;

public class JogoFut {
    public static void main(String[] args) {
        int tA, tB, d;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero de goals do time A: ");
        tA = s.nextInt();

        System.out.println("Digite o numero de goals do time B: ");
        tB = s.nextInt();

        if(tA > tB){
            d = tA - tB;
        }
        else{
            d = tB - tA;
        }
        System.out.println("Diferenca: " + d);

        switch (d) {
            case 0: 
                System.out.println("Empate");
                break;
            case 1, 2, 3:
                System.out.println("Jogo normal");
                break;
            case 4, 5, 6, 7, 8:
                System.out.println("Goleada");
                break;
        }
    }
}
