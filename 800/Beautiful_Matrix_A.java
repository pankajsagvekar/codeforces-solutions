import java.util.Scanner;

public class Beautiful_Matrix_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[5][5];
        int row = 0, column = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                
                //get pos of 1
                if (matrix[i][j] == 1){
                    row = i;
                    column = j;
                }
            }
        }

        int noOfMoves = Math.abs(column - 2) + Math.abs(row - 2); // 2 = middle position
        System.out.println(noOfMoves);
        sc.close();
    }
}
