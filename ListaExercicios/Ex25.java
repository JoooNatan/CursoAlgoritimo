import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int r1, r2, r3;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o tamanho do segmento da reta 1: ");
        r1 = s.nextInt();
        System.out.print("Digite o tamanho do segmento da reta 2: ");
        r2 = s.nextInt();
        System.out.print("Digite o tamanho do segmento da reta 3: ");
        r3 = s.nextInt();

        if(r1 < (r2 + r3) && r2 < (r1 + r3) && r3 < (r1 + r2)){
            System.out.print("É possivel formar um triangulo! ");
        }
        else{
            System.out.print("Não é possivel formar um triangulo! ");
        }
    }
}
/*25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois. */