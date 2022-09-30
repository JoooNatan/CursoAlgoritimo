import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        int idade[] = new int[10000000];
        int sexo[] = new int[10000000];
        int i = 0;
        String opcao = "s";
        int maiorIdade = 0;
        int homensCadastrado = 0;
        int menorIdadeF = 1000;
        double mediaM = 0;
        Scanner s = new Scanner(System.in);

        while(opcao.charAt(0) == 's') {
            System.out.printf("Digite o sexo da %d° pessoa (1-Masculino/2-Feminino) ", i + 1);
            sexo[i] = s.nextInt();
            System.out.printf("Digite a idade da %d° pessoa ", i + 1);
            idade[i] = s.nextInt();
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
            }
            if(sexo[i] == 1){
                homensCadastrado++;
                mediaM = mediaM + idade[i];
            }
            if(sexo[i] == 2 && idade[i] < menorIdadeF){
                menorIdadeF = idade[i];
            }
            System.out.print("Continuar(s/n)? ");
            opcao = s.next();
            System.out.print("--------------------------------------\n");
            i++;
        }
        mediaM = mediaM / homensCadastrado;
        System.out.printf("Maior idade: %d ", maiorIdade);
        System.out.printf("\nHomens cadastrados: %d ", homensCadastrado);
        System.out.printf("\nIdade da mulher mais jovem: %d", menorIdadeF);
        System.out.printf("\nMedia das idades dos Homens: %.1f", mediaM);
    }
}
