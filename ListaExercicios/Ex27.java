import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a primeira nota ");
        n1 = s.nextDouble();
        System.out.print("Digite a segunda nota ");
        n2 = s.nextDouble();
        media = (n1 + n2) / 2;
        System.out.println("Media: " + media);
        if(media < 5){
            System.out.print("Reprovado!");
        }
        else if(media >= 5 && media < 7){
            System.out.print("Recuperacao!");
        }
        else{
            System.out.print("Aprovado!");
        }

    }
}
/*27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO */