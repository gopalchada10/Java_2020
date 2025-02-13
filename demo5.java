import java.util.Scanner;
class demo5
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
 
		for(int i=(s1.length()-1);i>=0;i--)
			System.out.println(s1.charAt(i));
	}  
}
