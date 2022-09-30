import java.text.DecimalFormat;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        String gabarito [] = new String[5];
        String aluno [] = new String[3];
        String respAluno [] = new String[5];
        double notaAluno [] = new double[3];
        double media = 0;

        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("##.#");

        for(int i = 0; i < gabarito.length; i++){
            System.out.print("Digite a resposta da questao " + (i + 1) + ": ");
            gabarito[i] = s.next();
        }
        for(int i = 0; i < aluno.length; i++){
            System.out.print("Nome do aluno: ");
            aluno[i] = s.next();
            for(int j = 0; j < respAluno.length; j++){
                System.out.print("Resposta da questao " + (j + 1) + ": ");
                respAluno[j] = s.next();
            }
            for(int j = 0; j < respAluno.length; j++){
                if(respAluno[j].charAt(0) == gabarito[j].charAt(0)){
                    notaAluno[i] = notaAluno[i] + 2.0;
                }
            }
            media = media + notaAluno[i];
        }
        for(int i = 0; i < 3; i++){
            System.out.println(aluno[i] + " " + notaAluno[i]);
        }
        media = media / aluno.length;
        System.out.print("Media da turma: " + d.format(media));
    }
}
