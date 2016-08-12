import java.util.Scanner;


public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		 Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 if(a%4==0){
			 System.out.println("leap year");
		 }else{
			 System.out.println("not leap year");
		 }
	}

}
