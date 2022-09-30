import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        double salarioAtual, salarioReajustado, anosNaEmpresa;
        int sexo;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Qual o salario atual? ");
        salarioAtual = s.nextDouble();
        System.out.print("Qual a sexualidade?(1-Mulher/2-Homem) ");
        sexo = s.nextInt();
        System.out.print("Ha quantos anos trabalha na empresa? ");
        anosNaEmpresa = s.nextDouble();
        
        if(sexo == 1){
            if(anosNaEmpresa < 15){
                salarioReajustado = (salarioAtual * 0.05) + salarioAtual;
            }
            else if(anosNaEmpresa >= 15 && anosNaEmpresa < 20){
                salarioReajustado = (salarioAtual * 0.12) + salarioAtual;
            }
            else{
                salarioReajustado = (salarioAtual * 0.23) + salarioAtual;
            }
        }
        else{
            if(anosNaEmpresa < 20){
                salarioReajustado = (salarioAtual * 0.03) + salarioAtual;
            }
            else if(anosNaEmpresa >= 20 && anosNaEmpresa < 30){
                salarioReajustado = (salarioAtual * 0.13) + salarioAtual;
            }
            else{
                salarioReajustado = (salarioAtual * 0.25) + salarioAtual;
            }
        }
        System.out.printf("Salario reajustado R$%.2f", salarioReajustado);
    }
}
