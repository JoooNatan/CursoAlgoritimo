import java.util.Scanner;

public class CampeonatoFut {
    public static void main (String [] args){
        String time [] = new String[3];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < time.length; i++){
            System.out.print("Digite o nome do " + (i + 1) + "° time: ");
            time[i] = s.next();
        }
        for(int i = 0; i < time.length; i++){
            for(int j = 0; j < time.length; j++){
                if(i != j){
                    System.out.println(time[i] + " [ ] x [ ] " + time[j]);
                }
            }
        }
    }
}
