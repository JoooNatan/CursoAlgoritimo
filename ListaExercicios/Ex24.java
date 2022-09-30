import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        double distancia, precoPassagem;

        Scanner s = new Scanner(System.in);

        System.out.println("Qual a distancia que voce percorrera?(Km) ");
        distancia = s.nextDouble();
        if(distancia < 200){
            precoPassagem = distancia * 0.50;
        }
        else{
            precoPassagem = distancia * 0.45;
        }
        System.out.printf("O valor da passagem sera de R$%.2f ", precoPassagem);
    }
}
/*24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas. */