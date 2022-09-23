import java.util.Scanner;
public class ternary{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=a>>2;
		int c=a<<2;

		System.out.println(b);
		System.out.println(c);
	}
}
