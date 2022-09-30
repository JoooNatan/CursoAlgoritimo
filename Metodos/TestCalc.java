package Metodos;

import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
        int x, y;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        x = s.nextInt();
        System.out.println("Digite o segundo valor");
        y = s.nextInt();
        Calculadora c = new Calculadora();
        System.out.println("A soma dos valores é: " + c.soma(x, y));
    }
}
