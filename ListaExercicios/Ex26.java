import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int i1, i2;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        i1 = s.nextInt();
        System.out.print("Digite o segundo valor: ");
        i2 = s.nextInt();

        if(i1 > i2){
            System.out.print("O primeiro valor é o maior");
        }
        else if(i1 < i2){
            System.out.print("O segundo valor é o maior");
        }
        else{
            System.out.print("Não existe valor maior, os dois são iguais");
        }
    }
}
/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais */