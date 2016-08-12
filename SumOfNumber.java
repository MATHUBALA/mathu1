import java.util.Scanner;


public class SumOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int a[]=new int[10];
		 int sum = 0;
		 Scanner s=new Scanner(System.in);
		 for(int i=0;i<10;i++){
			 a[i]=s.nextInt();
			 
			 
		 }
		 for(int i=0;i<10;i++){
		    sum=sum+a[i];
		 }
		 System.out.println(sum);
	}

}
