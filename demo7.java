import java.util.Scanner;
class demo7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int index=0;index<s1.length();index++)
		{
			char ch=s1.charAt(index);
			int i=ch;
			System.out.println("ascii"+s1.charAt(index)+"is"+i);
		}
	}  
}
