/* Adam Dam
 * Feb. 15, 2022
 * To demonstrate knowledge in arrays and logic
 */
package unit1;

public class MyArray {

	public static void main(String[] args) {
		int x[] = new int[12];

		for (int i = 0 ; i < x.length ; i++) {
			x[i] =(int)(Math.random()*99+1);
		}
		int big = x[0];
		int small = x[0];
		for (int i = 0 ; i < x.length ; i++) {
			System.out.printf("%d ",x[i]);
		}
		System.out.println();
		for (int i = 0 ; i < x.length ; i++) {
			if (x[i] > big) {
				big = x[i];
			}
			if (x[i] < small) {
				small = x[i];
			}
		}
		System.out.printf("big = %d  small = %d",big,small);
	}
}
