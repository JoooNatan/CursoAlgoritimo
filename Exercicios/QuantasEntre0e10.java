import java.util.Scanner;

public class QuantasEntre0e10 {
    public static void main(String[] args) {
        int cont, v, tot010 = 0, sImp = 0;

        Scanner s = new Scanner(System.in);

        for(cont = 1; cont <= 5; cont++){
            System.out.println("Digite um valor");
            v = s.nextInt();
            if(v >= 0 && v <= 10){
                tot010 = tot010 + 1;
            }
            if(v % 2 == 1){
                sImp = sImp + v;
            }
        }
        System.out.println("Ao todo foram " + tot010 + " valores entre 0 e 10");
        System.out.println("Nesse intervalo, a soma dos impares foi " + sImp);
    }
}
