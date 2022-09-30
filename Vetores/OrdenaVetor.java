import java.util.Scanner;

public class OrdenaVetor {
    public static void main(String[] args) {
        int vet [] = new int[10];
        int i, j, aux;
        vet[0] = 12;
        vet[1] = 15;
        vet[2] = 2;
        vet[3] = 5;
        vet[4] = 22;
        vet[5] = 10;
        vet[6] = 1;
        vet[7] = 7;
        vet[8] = 31;
        vet[9] = 33;

        /*
        Scanner s = new Scanner(System.in);
        for(i = 0; i < vet.length; i++){
            System.out.print("Digite um valor ");
            vet[i] = s.nextInt();
        }
        */
        for(i = 0; i < 9; i++){
            for(j = i + 1; j < 10; j++){
                if(vet[i] > vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for(i = 0; i < 10; i++){
            System.out.print(vet[i] + " ");
        }
    }
}
