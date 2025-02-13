import java.util.Scanner;
class test4
{
	public static void main(String[] args) 
	{ 
		int count=0,count1=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			if((int)s1.charAt(i)>=97&&(int)s1.charAt(i)<=122)
			{
				count++;
			}
			else if((int)s1.charAt(i)>=64&&(int)s1.charAt(i)<=90)
			{
				count1++;
			}

		}
		System.out.println(count+"no of small letters");
		System.out.println(count1+"no of capital letters");		
	}  
}
