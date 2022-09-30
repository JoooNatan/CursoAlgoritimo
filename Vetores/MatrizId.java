public class MatrizId {
    public static void main(String[] args) {
        int matID[][] = new int [4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == j){
                    matID[i][j] = 1;
                }
                else{
                    matID[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matID[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
