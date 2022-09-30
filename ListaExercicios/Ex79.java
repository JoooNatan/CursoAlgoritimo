import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int numsPar[] = new int[10];
        int indicesPar[] = new int[10];
        int cont = 0, contPar = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++) {
            System.out.printf("Digite o %d° valor ", i + 1);
            nums[i] = input.nextInt();
            if(nums[i] % 2 == 0) {
                numsPar[i - cont] = nums[i];
                indicesPar[i - cont] = i;
                contPar++;
            }
            else {
                cont++;
            }
        }
        System.out.print("Numeros pares digitados: ");
        for(int i = 0; i < contPar; i++){
            System.out.printf("%d, ", numsPar[i]);
        }
        System.out.print("\nIndices dos numeros pares digitados: ");
        for(int i = 0; i < contPar; i++){
            System.out.printf("%d, ", indicesPar[i]);
        }
    }
}
