package Metodos;

public class ParOuImpar {
    public int verificaImparPar(int a){
        if(a % 2 == 0){
            System.out.println("O numero " + a + " é par");
        }
        else{
            System.out.println("Nao e par");
        }
        return a;
    }
}
