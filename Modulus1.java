/* Adam Dam
 * February 10, 2022
 * To demonstrate the usage of the Modulus Function 
 */
package unit1;

public class Modulus1 {

	public static void main(String[] args) {
		for (int i = 0 ; i <= 255 ; i++) {
			System.out.printf("%d %8d %n",i,i%8);
		}
		System.out.println();
		for (int i = 0 ; i <= 201 ; i++) {
			if (i % 13 == 0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 1 ; i <= 200 ; i++) {
			System.out.printf("%4d ",i);
			if (i % 12 == 0) System.out.println();
		}
	}

}
