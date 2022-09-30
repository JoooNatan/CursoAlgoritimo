import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double altura, peso, imc;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua altura");
        altura = s.nextDouble();

        System.out.println("Digite seu peso");
        peso = s.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        }
        else
            if(imc >= 17 && imc < 18.5){
                System.out.println("Abaixo do peso");
            }
            else
                if(imc >= 18.5 && imc < 25){
                    System.out.println("Peso ideal");
                }
                else
                    if(imc >= 25 && imc < 30){
                        System.out.println("Sobrepeso");
                    }
                    else
                        if(imc >= 30 && imc < 35){
                            System.out.println("Obesidade");
                        }
                        else
                            if(imc >= 35 && imc < 40){
                                System.out.println("Obesidade severa");
                            }
                            else{
                                System.out.println("Obesidade morbida");
                            }
    }
}
