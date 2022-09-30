import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        double nums[] = new double[1000];
        double soma = 0, media = 0, menorValor = 100000;
        int i = 0, contPar = 0;
        String op = "s";
        Scanner input = new Scanner(System.in);

        do{
            System.out.printf("Digite o %d° valor ", i + 1);
            nums[i] = input.nextDouble();
            soma = soma + nums[i];
            if(nums[i] < menorValor){
                menorValor = nums[i];
            }
            if(nums[i] % 2 == 0){
                contPar++;
            }
            System.out.printf("Continuar?(s/n) ");
            op = input.next();
            i++;
        }
        while(op.charAt(0) == 's');
        media = soma / i;
        System.out.printf("Soma de todos os valores: %.1f", soma);
        System.out.printf("\nO menor valor foi: %.1f", menorValor);
        System.out.printf("\nMedia de todos os valores: %.1f", media);
        System.out.printf("\n%d numeros sao pares", contPar);
    }
}
