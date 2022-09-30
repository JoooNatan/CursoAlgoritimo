import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        String nome [] = new String[4];
        double n1 [] = new double[4];
        double n2 [] = new double[4];
        double media [] = new double[4];
        double somaMedia = 0, mediaTurma = 0;
        int tot = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("----------- ALUNO " + (i + 1) + " -----------\nNome ");
            nome[i] = s.next();
            System.out.println("Primeira nota");
            n1[i] = s.nextDouble();
            System.out.println("Segunda nota");
            n2[i] = s.nextDouble();
            media[i] = (n1[i] + n2[i]) / 2;
            System.out.println("Media: " + media[i]);
            somaMedia = somaMedia + media[i];
        }
        mediaTurma = somaMedia / 4;

        System.out.println("\nLISTAGEM DE ALUNOS");
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i] + " " + media[i]);
            if(media[i] > mediaTurma){
                tot = tot + 1;
            }
        }
        System.out.println("Ao todo temos " + tot + " alunos acima da media, que e " + mediaTurma);
    }
}
