/*
	ISYS 320
	Name(s): Gabriel Lopez	
	Date: 04/06/2018
/* I missed calculated that it would continue adding the missing parts */

/*
 Your expected results after the input is provided:
 
 1.eg
 2.ns
 3. za
 4. qr
  
 */ 
public class P1_CharForLoopOutput {

	public static void main(String[] args) {
		// put your call to printRange below here
		printRange('e', 'g');
		printRange('n', 's');
		printRange('z', 'a');
		printRange('q', 'r');
	}
	
	public static void printRange(char startLetter, char endLetter ) {
		for( char letter = startLetter; letter <= endLetter; letter++ ) {
			System.out.print( letter );
		}
		
		System.out.println();
	}

}
