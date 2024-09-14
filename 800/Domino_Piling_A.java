import java.util.Scanner;

public class Domino_Piling_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int mxn = m*n;

        int dominos = Math.floorDiv(mxn, 2);
        System.out.println(dominos);
    }
}