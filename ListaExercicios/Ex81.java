import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
        int idade[] = new int[8];
        int indiceIdadeAcima25[] = new int[8];
        int maiorIdade = 0;
        int indiceMaiorIdade = 0;
        int c = 0;//variavel usada para organizar o vetor indiceIdadeAcima25[]
        int IA25 = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.printf("Digite a %d° idade ", i + 1);
            idade[i] = input.nextInt();
            media = media + idade[i];
            if (idade[i] > 25) {
                indiceIdadeAcima25[i - c] = i;
                IA25++;
            }
            else {
                c++;
            }
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                maiorIdade = idade[i];
                indiceMaiorIdade = i;
            }
        }
        media = media / 8;
        System.out.printf("Media das idade: %.1f", media);
        System.out.printf("\nPosições das idades acima de 25: ");
        for (int i = 0; i < IA25; i++) {
            System.out.printf("%d ", indiceIdadeAcima25[i]);
        }
        System.out.printf("\nMaior idade digitada: %d", maiorIdade);
        System.out.printf("\nPosições da maior idade: %d", indiceMaiorIdade);
    }
}
