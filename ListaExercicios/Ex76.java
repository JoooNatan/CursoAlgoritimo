import java.util.Random;

public class Ex76 {
    public static void main(String[] args) {
        int nums[] = new int[7];
        Random rand = new Random();

        for(int i = 0; i < nums.length; i++) {
            int r = rand.nextInt(1000);
            nums[i] = r;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
