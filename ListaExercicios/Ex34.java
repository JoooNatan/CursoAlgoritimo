import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o peso ");
        peso = s.nextDouble();
        System.out.print("Digite a altura ");
        altura = s.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("IMC: %.1f\n", imc);
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.5 && imc < 25){
            System.out.println("Peso ideal");
        }
        else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }
        else if(imc >= 30 && imc < 40){
            System.out.println("Obesidade");
        }
        else{
            System.out.println("Obesidade morbita");
        }
    }
}
