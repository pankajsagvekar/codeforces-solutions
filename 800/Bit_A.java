import java.util.Scanner;

public class Bit_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.next();

            if (input.equals("++X") || input.equals("X++")) {
                x += 1;                
            }
            else{
                x-= 1;
            }
        }

        System.out.println(x);
        sc.close();
    }
}
