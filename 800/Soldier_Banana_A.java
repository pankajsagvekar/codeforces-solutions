import java.util.Scanner;

public class Soldier_Banana_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price_of_banana = sc.nextInt();
        int money = sc.nextInt();
        int no_of_bananas = sc.nextInt();
        int total_cost = 0;

        for (int i = 1; i <= no_of_bananas; i++) {
            total_cost += price_of_banana * i;
        }

        int money_to_borrow = total_cost - money;

        if (money_to_borrow <= 0) {
            System.out.println(0);
        }
        else{
            System.out.println(money_to_borrow);
        }
        sc.close();
    }
}