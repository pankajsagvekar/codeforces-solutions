import java.util.Scanner;

public class NextRound_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of participants
        int k = sc.nextInt(); // the k-th place that defines the qualifying score
        
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int threshold = scores[k - 1]; // The score at position k

        int no_of_participants = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= threshold && scores[i] > 0) {
                no_of_participants++;
            }
        }
        
        System.out.println(no_of_participants);
        sc.close();
    }
}
