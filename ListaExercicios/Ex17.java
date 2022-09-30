import java.util.Scanner;

public class Ex17{
    public static void main(String [] args){
        double velocidade, multa;
        Scanner s = new Scanner(System.in);

        System.out.print("Qual a sua velocidade? ");
        velocidade = s.nextDouble();

        if(velocidade > 80){
            velocidade = velocidade - 80;
            multa = velocidade * 5;
            System.out.printf("Voce esta acima da velocidade permitida e sera multado em R$%.2f", multa);
        }
        else{
            System.out.print("Parabens voce esta dentro da velocidade da via!");
        }
    }
}
/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */