import java.util.Scanner;

public class Somador{
    public static void main(String[] args) {
        int cont = 1, soma = 0, n, maior = 0, menor = 10000;

        Scanner s = new Scanner(System.in);

        while(cont <= 5){
            System.out.println("Digite o " + cont + "° valor ");
            n = s.nextInt();
            soma = soma + n;
            if(n > maior){
                maior = n;
            }
            if(n < menor){
                menor = n;
            }
            cont++;
        }
        System.out.println("O resultado da soma dos numeros é: " + soma);
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("O menor numero digitado foi: " + menor);
    }
}
