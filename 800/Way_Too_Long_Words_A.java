import java.util.Scanner;
import java.util.Arrays;

public class Way_Too_Long_Words_A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] words = new String[n];

		for(int i = 0; i<words.length; i++){
			words[i] = sc.next();
		}
		shortWords(words);
	}

	private static void shortWords(String[] words){
		for(String word : words){
			if (word.length() > 10){
				int midString = word.length() -2;
				System.out.println(word.substring(0, 1) +Integer.toString(midString)+ word.substring(word.length()-1));
			}
			else{
				System.out.println(word);
			}
		}
	}
}