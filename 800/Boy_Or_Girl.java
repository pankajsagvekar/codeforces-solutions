import java.util.HashSet;
import java.util.Scanner;

public class Boy_Or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        HashSet<Character> distinctWord = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            distinctWord.add(word.charAt(i));
        }

        if (distinctWord.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
