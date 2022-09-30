import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        int sexo[] = new int[8];
        double peso[] = new double[8];
        int contMulher = 0, contHomemAcima100kg = 0;
        double mediaPesoMulher = 0, maiorPesoHomem = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 8; i++){
            System.out.printf("Digite o peso da %d° pessoa ", i + 1);
            peso[i] = input.nextDouble();
            System.out.print("Digite o sexo(1-masculino/2-feminino) ");
            sexo[i] = input.nextInt();
            System.out.print("-------------------------------\n");
            if(sexo[i] == 2){
                mediaPesoMulher = mediaPesoMulher + peso[i];
                contMulher++;
            }
            if(sexo[i] == 1 && peso[i] > 100){
                contHomemAcima100kg++;
            }
            if(sexo[i] == 1 && peso[i] > maiorPesoHomem){
                maiorPesoHomem = peso[i];
            }
        }
        mediaPesoMulher = mediaPesoMulher / contMulher;
        System.out.printf("%d mulheres foram cadastradas", contMulher);
        System.out.printf("\n%d homens pesam mais de 100kg", contHomemAcima100kg);
        System.out.printf("\nMedia dos pesos das mulheres: %.1f", mediaPesoMulher);
        System.out.printf("\nO maior peso entre os homens foi de %.1fkg", maiorPesoHomem);
    }
}
