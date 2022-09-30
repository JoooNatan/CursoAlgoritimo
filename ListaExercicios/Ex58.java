import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        int idade[] = new int[100000];
        double media = 0;
        int i = 0, contAluno = 0;
        boolean op = true;
        Scanner s = new Scanner(System.in);

        while(op == true) {
            System.out.printf("Digite a idade do %d° aluno ", i + 1);
            idade[i] = s.nextInt();
            if(idade[i] == 999){
                op = false;
            }
            else{
                media = media + idade[i];
                contAluno++;
            }
            i++;
        }
        media = media / contAluno;
        System.out.printf("Numero de alunos: %d ", contAluno);
        System.out.printf("\nMedia da idade: %.1f ", media);
    }
}
