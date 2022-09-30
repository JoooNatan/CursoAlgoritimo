import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        double preco[] = new double[8];
        double maior = 0, menor = 1000000000;
        int i = 0;
        Scanner s = new Scanner(System.in);

        while(i < preco.length) {
            System.out.printf("Digite o preco do %d° produto: ", i + 1);
            preco[i] = s.nextDouble();
            if(preco[i] > maior){
                maior = preco[i];
            }
            if(preco[i] < menor){
                menor = preco[i];
            }
            i++;
        }
        System.out.printf("Maior preço: %.2f\n", maior);
        System.out.printf("Menor preço: %.2f", menor);
    }
}
