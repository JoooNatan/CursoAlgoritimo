import java.util.Scanner;

public class DissecandoMatriz {

    static int m [][] = new int[4][4];
    static int l, c, op;

    public static void MostraMatriz(){
        for(l = 0; l < 4; l++){
            for(c = 0; c < 4; c++){
                System.out.print(m[l][c] + "  ");
            }
            System.out.println();
        }
    }

    public static void DiagonalPrincipal(){
        int t;
        for(l = 0; l < 4; l++){
            System.out.print(m[l][l]);
            for(t = 1; t < l; t++){
                System.out.print("  ");
            }
        }
    }

    public static void TrianguloSuperior(){
        int t;
        for(l = 0; l < 3; l++){
            System.out.print("  ");
            for(c = l + 1; c < 4; c++){
                System.out.print(m[l][c]);
            }
            System.out.println();
            for(t = 1; t < l; t++){
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void TrianguloInferior(){
        for(l = 2; l < 4; l++){
            System.out.print(m[l][c]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                System.out.print("Digite valor para a posicao [" + l + "," + c + "]: ");
                m[l][c] = s.nextInt();
            }
        }

        
        System.out.println();
        System.out.println("MENU DE OPCOES");
        System.out.println("====================");
        System.out.println("[1] Mostrar a Matriz");
        System.out.println("[2] Diagonal Principal");
        System.out.println("[3] Triangulo Superior");
        System.out.println("[4] Triangulo Inferior");
        System.out.println("[5] Sair");
        System.out.println("===== OPCAO: ");
        op = s.nextInt();
        
        switch(op){
            case 1:
                MostraMatriz();
                break;
            case 2:
                DiagonalPrincipal();
                break;
            case 3:
                TrianguloSuperior();
                break;
            case 4:
                TrianguloInferior();
                break;
            case 5:
                System.out.println("ENCERRANDO...");
                break;
        }
    }
}
