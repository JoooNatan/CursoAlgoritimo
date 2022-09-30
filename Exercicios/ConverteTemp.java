import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverteTemp {
    public static void main(String[] args) {
        double celcius, fahrenheit;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit");
        fahrenheit = s1.nextDouble();
        celcius = (fahrenheit - 32) / 1.8;

        DecimalFormat df = new DecimalFormat("##.#");
        System.out.println("A temperatura em celcius é: " + df.format(celcius) + " C°");
    }
}
