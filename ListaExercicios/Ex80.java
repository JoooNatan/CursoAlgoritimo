import java.util.Random;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        int nums[] = new int[30];
        int indice[] = new int[30];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int r, chave, cont = 0, contChave = 0;

        for(int i = 0; i < 30; i++) {
            r = rand.nextInt(15) + 1;
            nums[i] = r;
        }
        System.out.print("Digite o numero chave ");
        chave = input.nextInt();
        for(int i = 0; i < 30; i++) {
            if(chave == nums[i]) {
                indice[i - cont] = i;
                contChave++;
            }
            else {
                cont++;
            }
        }
        System.out.print("O numero chave foi encontrado no(s) indice(s): ");
        for(int i = 0; i < contChave; i++) {
            System.out.printf("%d ", indice[i]);
        }
        if(contChave > 1){
            System.out.printf("\nO numero chave foi encontrado %d vezes", contChave);
        }
        System.out.printf("\n");
        for(int i = 0; i < 30; i++) {
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
