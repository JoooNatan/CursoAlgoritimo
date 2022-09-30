public class Ex74 {
    public static void main(String[] args) {
        int nums[] = new int[10];

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                nums[i] = 5;
            }
            else{
                nums[i] = 3;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("[%d] ", nums[i]);
        }
    }
}
