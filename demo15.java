import java.util.Scanner;
class demo15
{
	
	public static void main(String[] args) 
	{ 
		int count=0;	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i))>'a'&&(s1.charAt(i)<'z'))
			{
				count=0;
			}
			else
				count++;
				
			
		}
		System.out.println(count);
		
	}  
}
