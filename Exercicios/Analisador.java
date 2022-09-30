import java.util.Scanner;

public class Analisador {
    public static void main(String[] args) {
        int num, contDiv5 = 0, contNulo = 0, somaPar = 0;
        double soma = 0, media = 0;

        Scanner s = new Scanner(System.in);

        for(int c = 1; c <= 5; c++) {
            System.out.println("Digite o " + c + "° valor");
            num = s.nextInt();
            soma = soma + num;
            if(num % 5 == 0){
                contDiv5++;
            }
            if(num == 0){
                contNulo++;
            }
            if(num % 2 == 0){
                somaPar = somaPar + num;
            }
        }
        media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        if(contDiv5 == 1){
            System.out.println(contDiv5 + " numero divisivel por 5");
        }
        else{
            System.out.println(contDiv5 + " numeros sao divisiveis por 5");
        }
        if(contNulo == 1){
            System.out.println(contNulo + " numero nulo");
        }
        else{
            System.out.println(contNulo + " numeros sao nulos");
        }
        System.out.println("Soma dos numeros pares: " + somaPar);
    }
}
