package Metodos;

import java.util.Scanner;

public class TestPar {
    public static void main(String[] args) {
        int b;

        Scanner c = new Scanner(System.in);
        System.out.println("Digite um numero");
        b = c.nextInt();
        ParOuImpar p = new ParOuImpar();
        p.verificaImparPar(b);
    }
    
}
