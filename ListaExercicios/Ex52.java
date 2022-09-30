import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        int idade[] = new int[10];
        int i = 0, maior18 = 0, menor5 = 0, maiorIdade = 0;
        double media = 0;
        Scanner s = new Scanner(System.in);

        while(i < idade.length) {
            System.out.printf("Digite a %d° idade ", i + 1);
            idade[i] = s.nextInt();
            media = media + idade[i];
            if(idade[i] > 18){
                maior18++;
            }
            if(idade[i] < 5){
                menor5++;
            }
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
            }
            i++;
        }
        media = media / idade.length;
        System.out.printf("\nMedia das idades: %.1f\n", media);
        System.out.printf("%d pessoas acima de 18 anos\n", maior18);
        System.out.printf("%d pessoas abaixo de 5 anos\n", menor5);
        System.out.printf("A maior idade digitada foi %d anos", maiorIdade);
    }
}
