import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double dis;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma distancia em metros: ");
        dis = s.nextDouble();
        System.out.println((dis / 1000) + " km");
        System.out.println((dis / 100) + " hm");
        System.out.println((dis / 10) + " dam");
        System.out.println((dis * 10) + " dm");
        System.out.println((dis * 100) + " cm");
        System.out.println((dis * 1000) + " mm");
    }
}
/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm */