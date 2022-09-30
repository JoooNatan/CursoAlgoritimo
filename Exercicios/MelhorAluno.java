import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        double nota, mNota = 0;
        String nome, mNome = "";
        int cont = 1, nTurma;

        Scanner s = new Scanner(System.in);

        System.out.println("Quantos alunos tem a turma?");
        nTurma = s.nextInt();

        while(cont <= nTurma){
            System.out.println("Aluno " + cont);
            System.out.println("Nome do aluno: ");
            nome = s.next();
            System.out.println("Nota de " + nome + ": ");
            nota = s.nextDouble();
            System.out.println("---------------");
            if(nota > mNota){
                mNota = nota;
                mNome = nome;
            }
            cont++;
        }
        System.out.println("O melhor aproveitamento foi de " + mNome + " com a nota " + mNota);

    }
}
