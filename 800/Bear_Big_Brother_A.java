import java.util.Scanner;

public class Bear_Big_Brother_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int years = 0;

        while (limak <= bob) {
            limak *= 3;
            bob *= 2;
            years ++;
        }

        System.out.println(years);
        sc.close();
    }
}