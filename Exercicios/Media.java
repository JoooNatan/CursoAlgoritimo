import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double media, n1, n2;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        n1 = s1.nextDouble();

        System.out.println("Digite a segunda nota");
        n2 = s1.nextDouble();

        media = (n1 + n2) / 2;
        System.out.println("Media: " + media);

        if(media >= 9.0 && media <= 10){
            System.out.println("Aproveitamento A");
        }
        else 
            if(media >= 8.0 && media < 9.0){
            System.out.println("Aproveitamento B");
            }
            else
                if(media >= 7.0 && media < 8.0){
                System.out.println("Aproveitamento C");
                }
                else
                    if(media >= 6.0 && media < 7.0){
                        System.out.println("Aproveitamento D");
                    }
                    else
                        if(media >= 5.0 && media < 6.0){
                            System.out.println("Aproveitamento E");
                        }
                        else{
                            System.out.println("Aproveitamento F");
                        }
    }
}
