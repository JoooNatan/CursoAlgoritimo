import java.util.Random;

public class Ex50 {
    public static void main(String[] args) {
        Random r = new Random();
        int nums[] = new int[20];
        int i = 0, j = 0;
        int acimaDe5 = 0, divPor3 = 0;
        while (i < 20) {
            int rand = r.nextInt(10);
            nums[i] = rand;
            if(nums[i] > 5){
                acimaDe5 = acimaDe5 + 1;
            }
            if(nums[i] % 3 == 0){
                divPor3 = divPor3 + 1;
            }
            i++;
        }
        System.out.print("Numeros sorteados\n");
        while (j < 20) {
            System.out.print(" " + nums[j]);
            j++;
        }
        System.out.printf("\n%d numeros maior do que 5\n%d numeros sao divisiveis por 3", acimaDe5, divPor3);
    }
}
