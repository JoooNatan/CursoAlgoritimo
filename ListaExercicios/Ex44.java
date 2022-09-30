import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        int valorInicial, valorFinal, incremento;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor inicial ");
        valorInicial = s.nextInt();
        System.out.print("Digite o valor final ");
        valorFinal = s.nextInt();
        System.out.print("Digite o valor incremento ");
        incremento = s.nextInt();

        while(valorInicial <= valorFinal) {
            System.out.print(" " + valorInicial);
            valorInicial = valorInicial + incremento;
        }
        System.out.print(" Acabou!");
    }
}
