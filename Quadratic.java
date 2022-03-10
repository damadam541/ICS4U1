/* Adam Dam
 * Feb. 14, 2022
 * To demonstrate ways to do math in Java
 */
package unit1;
import java.util.Scanner;
public class Quadratic {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double x1,x2,dscm;
		double a = 0;
		double b = 0;
		double c = 0;
		System.out.println("Welcome to the Quadratic Solver");
		
		System.out.print("Enter your A value: ");
		a = sc.nextDouble();
		
		System.out.print("Enter your B value: ");
		b = sc.nextDouble();
		
		System.out.print("Enter your C value: ");
		c = sc.nextDouble();
		
		System.out.printf("'a' = %.4f 'b' = %.4f 'c' = %.4f %n",a,b,c);
		dscm = Math.pow(b,2)-(4*a*c);
		if (dscm < 0) {
			System.out.print("No roots");
		}
		if (dscm == 0) {
			x1 = (-b+Math.sqrt(dscm))/2*a;
			System.out.printf("One root x = %f %n",x1);
		}
		if (dscm > 0) {
			x1 = (-b+Math.sqrt(dscm))/(2*a);
			x2 = (-b-Math.sqrt(dscm))/(2*a);
			System.out.printf("x1 = %.4f x2 = %.4f", x1,x2);
		}
	}
}