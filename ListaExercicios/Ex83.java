import java.util.Random;

public class Ex83 {
    public static void main(String[] args) {
        int nums[] = new int[20];
        Random rand = new Random();
        int aux;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(99);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("[%d] ", nums[i]);
        }
        for (int i = 0; i < 19; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (nums[i] > nums[j]) {
                    aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        System.out.print("\n\nVetor organizado abaixo\n\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
