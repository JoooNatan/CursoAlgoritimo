import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int cont = 1, num, contDiv = 0;
       
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        num = s.nextInt();

        while(cont <= num){
            if(num % cont == 0){
                contDiv = contDiv + 1;
            }
            cont++;
        }
        if(contDiv > 2){
            System.out.println("O valor " + num + " nao e primo!");
        }
        else{
            System.out.println("O valor " + num + " e primo!");
        }
    }
}
