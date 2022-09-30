public class Ex75 {
    public static void main(String[] args) {
        int nums[] = new int[15];
        int t1 = 0, t2 = 1, t3;

        System.out.printf("[%d] ", t2);
        for(int i = 3; i < 18; i++) {
            t3 = t1 + t2;
            nums[i - 3] = t3;
            t1 = t2;
            t2 = t3;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
