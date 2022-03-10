/*
 * Adam Dam
 * Feb. 28, 2022
 * To demonstrate the use of Scanner and BufferedReader
 */
package unit1;
import java.io.*;
import java.util.Scanner;
public class MyScanner {
	
	public static void main(String[] args) {
		scannerMethod();
		bufferedreaderMethod();
	}

	public static void scannerMethod() {
		//Scanner Method
		System.out.println("--SCANNER METHOD--");
		File words = new File("words_alpha.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(words);
		} catch (FileNotFoundException e) {
			System.out.println("Please download words_alpha.txt from quarkphysics.ca");
			System.exit(0);
		}
		
		for (int i = 0 ; i < 15 ; i++) {
			System.out.println(sc.nextLine());
		}
	}
	
	public static void bufferedreaderMethod() {
		//BufferedReader Method
		System.out.println("--BUFFEREDREADER METHOD--");
		File words = new File("words_alpha.txt");
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader(words));
		} catch (FileNotFoundException e) {
			System.out.println("Please download words_alpha.txt from quarkphysics.ca");
			System.exit(0);
		}
		
		for (int i = 0 ; i < 15 ; i++) {
			try {
			System.out.println(br.readLine());
			} catch (IOException e) {
				System.out.println("Something went wrong, please run the program again...");
			}
		}
	}
}
