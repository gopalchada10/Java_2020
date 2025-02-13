import java.util.Scanner;
class demo23
{
	
	public static void main(String[] args) 
	{ 
		int count=0;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int s=ch;
			if(ch>='0'&&ch<='9')
			{
				sum=sum+(s-'0');
				

			}
			
				
		}
		System.out.println(sum);
		
	}  
}
