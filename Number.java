/*
 * Adam Dam
 * Feb. 23, 2022
 * To demonstrate the use of the char data type
 */
package unit1;

public class Number {

	public static void main(String[] args) {
		String abc = "A B C, It's easy as 1 2 3, as simple as Do re mi, A B C, 1 2 3 Baby you and me girl";
		char[] abcArray= abc.toCharArray();
		
		for (int i = 0 ; i < abc.length() ; i++) {
			if (abcArray[i] >= '0' && abcArray[i] <= '9') {
				abcArray[i]++;
			}
			System.out.print(abcArray[i]);
		}
	}

}