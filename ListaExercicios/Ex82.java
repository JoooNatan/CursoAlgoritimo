import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        double nota[] = new double[10];
        double media = 0, maiorNota = 0;
        int contAlunoAcimaMedia = 0, indiceMaiorNota = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a nota do %d° aluno: ", i + 1);
            nota[i] = input.nextDouble();
            media = media + nota[i];
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
                indiceMaiorNota = i;
            }
        }
        media = media / 10;
        for (int i = 0; i < 10; i++) {
            if (nota[i] > media) {
                contAlunoAcimaMedia++;
            }
        }
        System.out.printf("Media da turam: %.1f", media);
        System.out.printf("\n%d alunos estão acima da media", contAlunoAcimaMedia);
        System.out.printf("\nMaior nota digitada: %.1f", maiorNota);
        System.out.printf("\nIndice da maior nota: %d", indiceMaiorNota);
    }
}
