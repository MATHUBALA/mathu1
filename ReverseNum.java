import java.util.Scanner;


public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,sum = 0;
		int b[]=new int[10];
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		while(a>0){
			int n=a%10;
			a=a/10;
			System.out.println(n);
		}
		


	}

}
