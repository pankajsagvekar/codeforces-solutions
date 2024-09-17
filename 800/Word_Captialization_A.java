import java.util.Scanner;

public class Word_Captialization_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String cap = word.substring(0, 1).toUpperCase() + word.substring(1);

        System.out.println(cap);

        sc.close();
    }
}
