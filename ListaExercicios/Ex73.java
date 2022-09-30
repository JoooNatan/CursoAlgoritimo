public class Ex73 {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int decresente = 10;

        for(int i = 0; i < 10; i++){
            decresente = decresente - 1;
            nums[i] = decresente;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
