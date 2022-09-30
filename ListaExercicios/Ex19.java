import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        String nome;
        double n1, n2, media;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dgite seu nome ");
        nome = scan.next();
        System.out.print("Dgite a primeira nota ");
        n1 = scan.nextDouble();
        System.out.print("Dgite a segunda nota ");
        n2 = scan.nextDouble();
        media = (n1 + n2) / 2;
        System.out.printf("Media: %.1f \n", media);
        
        if(media > 7){
            System.out.printf("Parabens %s voce teve um bom aproveitamento :)", nome);
        }
        else{
            System.out.printf("%s voce nao teve um bom aproveitamento :(", nome);
        }
    }
}
/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0). */