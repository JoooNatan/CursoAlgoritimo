import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        int valorInicial, valorFinal, incremento;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor inicial ");
        valorInicial = s.nextInt();
        System.out.print("Digite o valor final ");
        valorFinal = s.nextInt();
        System.out.print("Digite o valor incremento ");
        incremento = s.nextInt();

        if(valorInicial > valorFinal){
            while(valorInicial >= valorFinal) {
                System.out.print(" " + valorInicial);
                valorInicial = valorInicial - incremento;
            }
            System.out.print(" Acabou!");
        }
        else{
            while(valorInicial <= valorFinal) {
                System.out.print(" " + valorInicial);
                valorInicial = valorInicial + incremento;
            }
            System.out.print(" Acabou!");
        }
    }
}
