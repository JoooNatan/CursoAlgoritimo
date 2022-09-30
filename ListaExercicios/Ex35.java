import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        int tipoCarro, diasAlugado;
        double precoTotal, precoKMs, precoDias, KMs;
        Scanner s = new Scanner(System.in);

        System.out.print("--------------Aluguel de carros--------------\n");
        System.out.print("Qual o tipo de carro?\n1-carro popular\n2-carro de luxo\n");
        tipoCarro = s.nextInt();
        System.out.print("Quantos dias de aluguel? ");
        diasAlugado = s.nextInt();
        System.out.print("Quantos KM foram rodados? ");
        KMs = s.nextInt();
        if(tipoCarro == 1){
            precoDias = diasAlugado * 90;
            if(KMs < 100){
                precoKMs = KMs * 0.20;
            }
            else{
                precoKMs = KMs * 0.10;
            }
        }
        else{
            precoDias = diasAlugado * 150;
            if(KMs < 200){
                precoKMs = KMs * 0.30;
            }
            else{
                precoKMs = KMs * 0.25;
            }
        }
        precoTotal = precoDias + precoKMs;
        System.out.printf("Preço total a ser pago: R$%.2f", precoTotal);
    }
}
