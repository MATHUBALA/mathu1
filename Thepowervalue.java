import java.util.Scanner;

public class Thepowervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0, exponent = 0;
		long result = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = s.nextInt();
		System.out.println("Enter the exponent value:");
		exponent = s.nextInt();
		while (exponent != 0) {
			result = result * number;
			--exponent;

		}
        System.out.println("The power of the integer value is");
		System.out.println(result);
	}
