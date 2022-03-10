/*
 * Adam Dam
 * Mar. 2, 2022
 * To demonstrate the usage of File I/O, try-catch, and String methods in one program
 */
package unit1;
import java.io.*;
import java.util.Scanner;
public class MillionWord {

	public static void main(String[] args) {
		int wordValue = 0;
		String x;
		int charArray[];
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("words_alpha.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Please download words_alpha.txt from quarkphysics.ca");
			System.exit(0);
		}

		while (sc.hasNextLine() == true) {
			wordValue = 1;
			x = sc.nextLine();
			charArray = new int[x.length()];
			for (int y = 0 ; y < x.length() ; y++) {
				charArray[y] = x.charAt(y)-96;
				wordValue *= charArray[y];
			}
			if (wordValue >= 999500 && wordValue <= 1000500) {
				System.out.printf("%s %10d%n",x,wordValue);
			}
		}
		System.out.println("Done!");
	}

}
