/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		
		System.out.print("How many words will you enter? ");
		int numOfWords = input.nextInt();
		
		String longestWord = "";
		System.out.printf("The longest word was \"%s\".\n", longestWord );
	}
	
}
