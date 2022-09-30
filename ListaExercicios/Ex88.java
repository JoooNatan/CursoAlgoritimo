public class Ex88 {
    static void Gerador(String frase, int c) {
        System.out.println("+-------=======------+");
        for (int i = 0; i < c; i++) {
            System.out.println("    " + frase);
        }
        System.out.println("+-------=======------+");
    }
    public static void main(String[] args) {
        Gerador("Salve!", 5);
    }
}
