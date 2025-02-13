import java.util.Scanner;
class demo3
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
 
		if(s1.charAt(0)=='a'||s1.charAt(0)=='e'||s1.charAt(0)=='i'||s1.charAt(0)=='o'||s1.charAt(0)=='u')
			System.out.println("it is vowel");
		else
			System.out.println("it is not vowel");
	}  
}
