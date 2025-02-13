import java.util.Scanner;
class demo2
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int index=0;index<s1.length();index++)
		{
			char ch=s1.charAt(index);
			System.out.println("character present at "+index+"is"+ch);
		}
	}  
}
