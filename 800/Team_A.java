import java.util.Scanner;

public class Team_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int no_of_yes = 0;

        int[][] array = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];

                if(sum >= 2){
                    no_of_yes +=1;
                    break; //not to compare after adding 0                 
                }
            }
        }

        System.out.println(no_of_yes);

        sc.close();
    }
}
