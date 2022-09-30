public class Ex46 {
    public static void main(String[] args) {
        int i = 6, soma = 0;

        while(i < 100){
            System.out.print(" " + i);
            soma = soma + i;
            i = i + 2;
        }
        System.out.printf("\nSoma dos numeros: %d", soma);
    }
}
