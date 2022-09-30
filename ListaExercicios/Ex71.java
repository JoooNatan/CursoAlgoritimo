public class Ex71 {
    public static void main(String[] args) {
        int nums[] = new int[8];

        for(int i = 0; i < 8; i++){
            nums[i] = 999;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
