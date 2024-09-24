import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x <= 5) {
            System.out.println("1");
        }
        else{
            int steps = (x + 4) / 5;
            System.out.println(steps);
        }

        sc.close();
    }
}
