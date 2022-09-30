import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int cigarrosPorDia, anosDeFumo;
        double cigarroFumado = 0.166667, r1, r2, r3;
        double dia = 24, ano = 8760;
        double minuto = 0.0166667, hora = 1;

        Scanner s = new Scanner(System.in);
        System.out.print("Quantos cigarros voce fuma por dia? ");
        cigarrosPorDia = s.nextInt();
        System.out.print("Quantos anos voce ja fumou? ");
        anosDeFumo = s.nextInt();
        r1 = cigarrosPorDia * cigarroFumado;
        r2 = (r1 * ano) * anosDeFumo;
        r3 = (r2 / 60) / dia;
        System.out.printf("Voce perdera %3.2f dias da sua vida", r3);
    }
}
/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias. */