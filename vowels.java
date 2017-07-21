import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		c=s.next().charAt(0);
		char a[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < a.length; i++) {
			if (c == a[i]){
				count++;
			}
		}
		if(count >0){
			System.out.println("vowels");
		}else{
			System.out.println("cons");
		}
			

	}
}
