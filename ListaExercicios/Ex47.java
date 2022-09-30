public class Ex47 {
    public static void main(String[] args) {
        int i = 500, soma = 0;

        while(i >= 0){
            System.out.print(" " + i);
            soma = soma + i;
            i = i - 50;
        }
        System.out.print("\nSoma dos numeros: " + soma);
    }
}
