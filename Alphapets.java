import java.util.Scanner;


public class Alphapets {

	
	public static void main(String[] args) {
		char a = 0;
		Scanner scanner=new Scanner(System.in);
		a=scanner.next().charAt(a);
		if(a>='a'&& a<='z'|| a>='A' && a<='Z'){
			System.out.println("This is a alphates");
		}else{
			System.out.println("This is not a alphates");
		}

	}

}
