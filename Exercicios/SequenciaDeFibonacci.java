public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        int c, t1 = 0, t2 = 1, t3;

        System.out.println(t1);
        System.out.println(t2);

        for(c = 3; c <= 15; c++) {
            t3 = t1 + t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}
