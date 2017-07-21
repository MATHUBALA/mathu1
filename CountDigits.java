import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		int number=0,count=0;
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(number!=0){
			number=number/10;
			++count;
		}
		System.out.println(count);

	}

}
