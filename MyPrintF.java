/* Adam Dam
 * February 2, 2022
 * Demonstrate the usage of the Printf function */
package unit1;

public class MyPrintF {

	public static void main(String[] args) {

		//Printf - Decimal Places
		double x = 1/7D;
		System.out.printf("%.5f%n", x);

		//Printf - Strings
		String name = ("Bessy");
		String colour = ("brown");
		int weight = 1200;

		//System.out.print("The cow's name is " + name + ", she is " + colour + " and weighs " + weight +" kg.");

		System.out.printf("The cow's name is %s, she is %s and weighs %d kg%n",name,colour,weight);

		//Printf - Formating
		int xx = 123;

		System.out.printf("| 12345678 |%n| ======== |%n| %8d |%n| %08d |%n| %+8d |%n| %-8d |%n| %8.1f |",xx,xx,xx,xx,(double)xx);
	}

}
