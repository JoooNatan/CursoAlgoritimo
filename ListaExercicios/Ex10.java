import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double largura, altura;
        double areaQuad, tinta;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        altura = s.nextDouble();
        System.out.print("Digite a largura: ");
        largura = s.nextDouble();
        areaQuad = largura * altura;
        tinta = areaQuad / 2;
        System.out.println("A area quadrada é: " + areaQuad);
        System.out.printf("Seram necesarios %.1f litros de tinta para pintar esta area", tinta);
    }
}
/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */