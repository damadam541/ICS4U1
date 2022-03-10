package unit1;

public class Sort {

	public static void main(String[] args) {
		int x[] = new int[14];
		int y = 0;
		System.out.print("Not Sorted: ");
		for (int i = 0 ; i < x.length ; i++) {
			x[i] = (int)(Math.random()*99+1);
			System.out.printf("%d ",x[i]);
		}
		int big = x[0];
		System.out.print("Sorted: ");
		for (int i = 0 ; i < x.length ; i++) {
			if (x[i] > big) {
				big = x[i];
			}
			if (x[i] < big) {
				y = x[0];
				x[0] = x[i];
				x[13] = y;
				System.out.printf("%d ",x[i]);
			}
		}
		System.out.println("\n"+big);
	}

}
