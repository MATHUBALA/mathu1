import java.util.Scanner;


public class VowelsConsulant {

	
	public static void main(String[] args) {
		char a = 0;
		Scanner scanner=new Scanner(System.in);
		a=scanner.next().charAt(a);
		if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'&& a=='A'|| a=='E'||a=='I'||a=='O'||a=='U'){
			System.out.println("this is a vowel");
		}else{
			System.out.println("this is a not vowel");
		}
	}

}
