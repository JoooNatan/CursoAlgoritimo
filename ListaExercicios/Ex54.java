import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        double peso[] = new double[7];
        double altura[] = new double[7];
        double mediaAltura = 0;
        int pessoaAcima90 = 0, pessoaAbaixo50e1e60 = 0, pessoAcima100ke1e90 = 0;
        int i = 0;
        Scanner s = new Scanner(System.in);

        while (i < 7){
            System.out.printf("Digite o peso da %d° pessoa ", i + 1);
            peso[i] = s.nextDouble();
            System.out.printf("Digite a altura da %d° pessoa ", i + 1);
            altura[i] = s.nextDouble();
            System.out.println("-----------------------------");
            mediaAltura = mediaAltura + altura[i];
            if(peso[i] > 90){
                pessoaAcima90++;
            }
            if(peso[i] < 50 && altura[i] < 1.60){
                pessoaAbaixo50e1e60++;
            }
            if(peso[i] > 100 && altura[i] > 1.90){
                pessoAcima100ke1e90++;
            }
            i++;
        }
        mediaAltura = mediaAltura / 7;
        System.out.printf("Media da altura do grupo: %.1f\n", mediaAltura);
        System.out.printf("%d pessoas pesam mais de 90kg\n", pessoaAcima90);
        System.out.printf("%d pessoas pesam menos de 50kg e tem menos de 1,50m\n", pessoaAbaixo50e1e60);
        System.out.printf("%d pessoas medem mais de 1,90m e pesam mais de 100kg", pessoAcima100ke1e90);
    }
}
