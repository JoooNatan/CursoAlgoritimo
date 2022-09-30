import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int r1, r2, r3;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o tamanho do segmento da reta 1: ");
        r1 = s.nextInt();
        System.out.print("Digite o tamanho do segmento da reta 2: ");
        r2 = s.nextInt();
        System.out.print("Digite o tamanho do segmento da reta 3: ");
        r3 = s.nextInt();

        if(r1 < (r2 + r3) && r2 < (r1 + r3) && r3 < (r1 + r2)){
            System.out.print("É possivel formar um triangulo ");
            if(r1 == r2 && r2 == r3 && r3 == r1){
                System.out.print("EQUILÁTERO!");
            }
            else if(r1 == r2 || r2 == r3 || r3 == r1){
                System.out.print("ISÓSCELES!");
            }
            else{
                System.out.print("ESCALENO!");
            }
        }
        else{
            System.out.print("Não é possivel formar um triangulo!");
        }
    }
}
/*30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes */