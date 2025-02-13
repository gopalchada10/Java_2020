import java.util.Scanner;
class demo6
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				System.out.print(s1.charAt(i));
	}  
}
