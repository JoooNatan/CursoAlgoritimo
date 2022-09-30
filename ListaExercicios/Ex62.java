import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        int idade[] = new int[1000];
        int i = 0, numPessoa21mais = 0;
        double media = 0;
        String op = "s";
        Scanner input = new Scanner(System.in);

        do{
            System.out.printf("Digite a idade da %d° pessoa ", i + 1);
            idade[i] = input.nextInt();
            if(idade[i] >= 21){
                numPessoa21mais++;
            }
            media = media + idade[i];
            i++;
            System.out.println("Continuar?(s/n) ");
            op = input.next();
        }
        while(op.charAt(0) == 's');
        
        media = media / i;
        if(i == 1){
            System.out.printf("%d idade foi digitada", i);
        }
        else{
            System.out.printf("%d idades foram digitadas", i);
        }
        System.out.printf("\nmedia das idades digitadas: %.1f", media);
        if(numPessoa21mais == 1){
            System.out.printf("\n%d pessoa acima de 21 ou com 21 anos", numPessoa21mais);
        }
        else{
            System.out.printf("\n%d pessoas acima de 21 ou com 21 anos", numPessoa21mais);
        }
    }
}
