import java.util.Scanner;

public class Minimize_A_{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		if(t <= 55 && t > 0){
			for(int i = 0; i < t; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.println(b-a);
			}
		}
	}
}
