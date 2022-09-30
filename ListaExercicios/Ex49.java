import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        int nums[] = new int[6];
        int contPar = 0, contImp = 0, i = 0;
        Scanner s = new Scanner(System.in);

        while(i < nums.length) {
            System.out.printf("Digite o %d° valor ", i + 1);
            nums[i] = s.nextInt();
            if(nums[i] % 2 == 0){
                contPar = contPar + 1;
            }
            else{
                contImp = contImp + 1;
            }
            i++;
        }
        System.out.printf("%d sao pares e %d sao impares", contPar, contImp);
    }
}
