import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        double largura, comprimento, area;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a largura ");
        largura = s.nextDouble();
        System.out.print("Digite o comprimento ");
        comprimento = s.nextDouble();
        area = largura * comprimento;

        System.out.printf("Area em m²: %.2f\n", area);
        if(area < 100){
            System.out.print("TERRENO POPULAR");
        }
        else if(area >= 100 && area <= 500){
            System.out.print("TERRENO MASTER");
        }
        else{
            System.out.print("TERRENO VIP");
        }
    }
}
/*28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP */