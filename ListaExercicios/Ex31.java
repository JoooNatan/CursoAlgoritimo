import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        int p = 0;
        String pedra = "pedra", papel = "papel", tesoura = "tesoura", jogador = "", adversario;
        Random rand = new Random();
        
        Scanner s = new Scanner(System.in);

        System.out.print("-----------------JoKenPo-----------------\n");
        while (p < 4) {
            int randnum = rand.nextInt(3) + 1;
            System.out.print("1-pedra\n2-papel\n3-tesoura\n4-sair\n");
            p = s.nextInt();
            switch (p) {
                case 1:
                    jogador = pedra;
                    break;
                case 2: 
                    jogador = papel;
                    break;
                case 3: 
                    jogador = tesoura;
                    break;
            }
            if (randnum == 1) {
                adversario = pedra;
            } else if (randnum == 2) {
                adversario = papel;
            } else {
                adversario = tesoura;
            }
            System.out.printf("%s X %s", jogador, adversario);
            if (p == randnum) {
                System.out.print("\nEmpate\n");
            } else if (p == 1 && randnum == 2 || p == 2 && randnum == 3 || p == 3 && randnum == 1) {
                System.out.print("\nVoce perdeu\n");
            } else {
                System.out.print("\nVoce ganhou\n");
            }
            System.out.println("-------------------------");
        }
    }
}
