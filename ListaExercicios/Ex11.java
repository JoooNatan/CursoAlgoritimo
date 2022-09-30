import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Definindo nossas variáveis[/color]
	
		double a;//nosso A da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "a" é o 2.[/color]
	
		double b;//nosso B da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "b" é o 3.[/color]
	
		double c;//nosso C da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "c" é o -10.[/color]
	
		double delta;//nosso Delta. Delta = "B" ao quadrado menos 4 vezes "A" vezes "C". Lembra?[/color]
	
		double x1;//nossa primeira raiz da equação.[/color]
	
		double x2;//nossa segunda raiz da equação.[/color]
	
	System.out.println("Escreva o valor de A:");
	
		a = input.nextDouble();//leitura do "a"[/color]
	
	System.out.println("Escreva o valor de B:");//mensagem[/color]
	
		b = input.nextDouble();//leitura do "b"[/color]
	
	System.out.print("Escreva o valor de C:");//mensagem[/color]
	
		c = input.nextDouble();//leitura do "c"[/color]

		delta = ((b*b)-(4*a*c));//calculando  o Delta[/color]
	
		x1 = 0;//definindo um valor inicial para o x1[/color]
	
		x2 = 0;//definindo um valor inicial para o x2[/color]
	
		if (delta >= 0)//se o delta for maior ou igual a zero podemos resolver...  [/color]
			{
				x1 = (  ( -b + (Math.sqrt (delta) )  )  / ( 2*a ) );//equação do x1[/color]
	
				x2 = (  ( -b + (Math.sqrt (delta) )  )  / ( 2*a ) );//equação do x2[/color]
	
				System.out.printf("x1 vale: "+ x1);//mostra o x1[/color]
	
				System.out.println("");//deixa uma linha em branco[/color]
				
				System.out.printf("x2 vale: "+ x2);//mostra o x2[/color]
		
				System.out.println("");//deixa uma linha em branco[/color]
	
			}
		else//senão(se o delta não for maior nem igual a zero) não podemos resolver...[/color]
			{
				System.out.println("Delta invalido");//avisa que o delta é inválido[/color]
			}
	
//By Elbe Miranda - elberalves@yahoo.com.br   ou  stevenbrother@hotmail.com[/color]
    }
}
