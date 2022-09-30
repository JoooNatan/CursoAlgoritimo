import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        String nome[] = new String[1000];
        int idade[] = new int[1000];
        int sexo[] = new int[1000];
        int i = 0, maiorIdade = 0, mulherMaisnova = 1000;
        int homeCom30Mais = 0, mulheresCom18Menos = 0;
        double media = 0;
        Scanner scan = new Scanner(System.in);
        String op = "s", pessoaMaiVelha = "", mulherMaisnovaS = "";

        while(op.charAt(0) == 's'){
            System.out.printf("Digite o nome da %d° pessoa ", i + 1);
            nome[i] = scan.next();
            System.out.print("Digite a idade da pessoa ");
            idade[i] = scan.nextInt();
            System.out.print("Digite o sexo da pessoa(1-masculino/2-feminino) ");
            sexo[i] = scan.nextInt();
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
                pessoaMaiVelha = nome[i];
            }
            if(idade[i] < mulherMaisnova && sexo[i] == 2){
                mulherMaisnova = idade[i];
                mulherMaisnovaS = nome[i];
            }
            if(idade[i] > 30 && sexo[i] == 1){
                homeCom30Mais++;
            }
            if(idade[i] < 18 && sexo[i] == 2){
                mulheresCom18Menos++;
            }
            media = media + idade[i];
            System.out.print("Continuar?(s/n) ");
            op = scan.next();
            i++;
        }
        media = media / i;
        System.out.printf("Nome da pessoa mais velha: %s, %d anos", pessoaMaiVelha, maiorIdade);
        System.out.printf("\nNome da mulher mais nova: %s, %d anos", mulherMaisnovaS, mulherMaisnova);
        System.out.printf("\nMedia de todas as idades: %.1f", media);
        System.out.printf("\n%d homes tem mais de 30 anos", homeCom30Mais);
        System.out.printf("\n%d mulheres com menos de 18 anos", mulheresCom18Menos);
    }   
}
