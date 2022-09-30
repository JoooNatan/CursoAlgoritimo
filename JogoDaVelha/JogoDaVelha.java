package JogoDaVelha;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        boolean game = true;
        String vitoria = "";
        Scanner s = new Scanner(System.in);

        iniciarJogo(velha);

        while(game == true){
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try{
                if(verificaJogada(velha, jogar(s, simboloAtual), simboloAtual)){
                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }
                    else{
                        simboloAtual = 'X';
                    }
                }

            }catch(Exception e){
                System.out.print("Erro");
            }
        }
        System.out.print("Fim do jogo");
    }

    public static void desenhaJogo(Campo[][] velha){
        LimparTela();
        System.out.print  (       "    0   1   2\n");
        System.out.printf ("0  %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("  -----------");
        System.out.printf ("1  %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("  -----------");
        System.out.printf ("2  %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }

    public static void LimparTela(){
        for(int i = 0; i < 200; i++){
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner s, char simboloAtual){
        int p[] = new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", simboloAtual);
        System.out.print("Iforme a linha: ");
        p[0] = s.nextInt();
        System.out.print("Iforme a coluna: ");
        p[1] = s.nextInt();
        return p;
    }

    public static boolean verificaJogada(Campo[][] velha, int p[], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }
        else{
            return false;
        }
    }

    public static void iniciarJogo(Campo[][] velha){
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                velha[l][c] = new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha){
        return "";
    }
}
