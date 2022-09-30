public class Ex72 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int somaCinco = 0;

        for(int i = 0; i < 10; i++){
            somaCinco = somaCinco + 5;
            nums[i] = somaCinco;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
