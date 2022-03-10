package unit1;

public class PrintfPractice {

	public static void main(String[] args) {
		String name = ("Greg");
		int age = 18;
		int number = 9*2;
		System.out.printf("%s is %d years old %b%n",name,age,number==age);
		
		double n1 = 3.14;
		double n2 = 2.71;
		double x = n1*n2;
		System.out.printf("%.2f*%.2f = %.4f",n1,n2,x);
	}

}
