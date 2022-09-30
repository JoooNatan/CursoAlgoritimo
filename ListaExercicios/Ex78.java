import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
        int nums[] = new int[15];
        int multiplosPorDez[] = new int[15];
        int cont = 0, contMultlipos = 0;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("Digite o valor do indice %d: ", i);
            nums[i] = input.nextInt();
            if(nums[i] % 10 == 0) {//verifica se o valor é multiplo de 10.
                multiplosPorDez[i - cont] = i;//se verdadeiro atribui ao vetor multiplosPorDez[] o indice.
                contMultlipos++;//conta quantos numeros são multiplo de 10.
            }
            else{
                cont++;//variavel usada para ordenar os indices.
            }
        }

        System.out.print("\n");
        for(int i = 0; i < multiplosPorDez.length; i++) {
            System.out.printf("[%d] ", nums[i]);//printa os valores do vetor nums[].
        }

        System.out.print("\nIndice dos numeros que são multiplos de dez: ");
        for(int i = 0; i < contMultlipos; i++) {
            System.out.printf("%d", multiplosPorDez[i]);//printa o indice dos valores que são multiplos de 10.
            if(contMultlipos != i + 1){
                System.out.print(", ");
            }
        }
    }
}
