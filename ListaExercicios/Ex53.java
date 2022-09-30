import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        int idade[] = new int[5];
        int sexo[] = new int[5];
        int i = 0, quantF = 0, quantM = 0, fAcima20 = 0;
        double mediaGeral = 0, mediaM = 0;
        Scanner s = new Scanner(System.in);

        while(i < 5){
            System.out.print("Digite a idade ");
            idade[i] = s.nextInt();
            System.out.print("Digite a sexo(1-masculino 2-feminino) ");
            sexo[i] = s.nextInt();
            if(sexo[i] == 1){
                quantM = quantM + 1;
                mediaM = mediaM + idade[i];
            }
            else{
                quantF = quantF + 1;
                fAcima20++;
            }
            mediaGeral = mediaGeral + idade[i];
            i++;
        }
        mediaGeral = mediaGeral / idade.length;
        mediaM = mediaM / quantM;
        System.out.printf("\n%d homens foram cadastrados\n", quantM);
        System.out.printf("%d mulheres foram cadastradas\n", quantF);
        System.out.printf("Media de todas as idades: %.1f\n", mediaGeral);
        System.out.printf("Media das idades dos homens: %.1f\n", mediaM);
        System.out.printf("%d mulheres acima de 20 anos", fAcima20);
    }
}
