import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        double horasDeAtividade, pontos = 0.0, dinheiro;
        Scanner s = new Scanner(System.in);

        System.out.print("Quantas de atividade fisica voce teve no mes? ");
        horasDeAtividade = s.nextDouble();
        if(horasDeAtividade < 10){
            pontos = horasDeAtividade * 2;
        }
        else if(horasDeAtividade >= 10 && horasDeAtividade < 20){
            pontos = horasDeAtividade * 5;
        }
        else{
            pontos = horasDeAtividade * 10;
        }
        dinheiro = pontos * 0.05;
        System.out.printf("Voce fez %.1f pontos e vai ganhar R$%.2f", pontos, dinheiro);
    }
}
