import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int ano = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um ano para verificar se ele e bisesto \n");
        ano = scan.nextInt();
        for(int i = 0; i < 3000; i = i + 4){
            if(ano == i){
                System.out.printf("O ano %d é bisesto", ano);
            }
            if(ano == i - 1){
                System.out.printf("O ano %d nao é bisesto", ano);
            }
        }
    }
}
/*21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO. */