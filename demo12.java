import java.util.Scanner;
class demo12
{
	public static void main(String[] args) 
	{
		int flag=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				count++;
				
		}
			System.out.println(count);
	}  
}
