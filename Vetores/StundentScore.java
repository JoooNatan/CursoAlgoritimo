import java.util.Scanner;

public class StundentScore {
    public static void main(String[] args) {
        double[] scores = new double[3];
        double soma = 0.0, media = 0.0;

        Scanner t1 = new Scanner(System.in);

        System.out.println("Digite a pontuacao de 3 estudantes");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = t1.nextDouble();
        }

        System.out.println("Exiba a pontuacao de 3 estudantes");
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for(int i = 0; i < scores.length; i++) {
            soma = soma + scores[i];
            media = soma /scores.length;
        }
        System.out.println("A pontuaçao media e: " + media);
    }
}
