public class Ex89 {
    static void Gerador(String frase, int c, int borda) {
        switch (borda) {
            case 1:
            System.out.println("+-------=======------+");
            for (int i = 0; i < c; i++) {
                System.out.println("    " + frase);
            }
            System.out.println("+-------=======------+");
            break;
            case 2:
            System.out.println("~~~~~~~~:::::::~~~~~~~");
            for (int i = 0; i < c; i++) {
                System.out.println("    " + frase);
            }
            System.out.println("~~~~~~~~:::::::~~~~~~~");
            break;
            case 3:
            System.out.println("<<<<<<<<------->>>>>>>");
            for (int i = 0; i < c; i++) {
                System.out.println("    " + frase);
            }
            System.out.println("<<<<<<<<------->>>>>>>");
            break;
        }
    }
    public static void main(String[] args) {
        Gerador("Salve!", 5, 3);
    }
}
