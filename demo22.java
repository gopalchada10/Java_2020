import java.util.Scanner;
class demo22
{
	public static void main(String[] args) 
	{
		int flag=0;
		int z=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		String s2="";
		for(char c1='a';c1<='z';c1++)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(c1==s1.charAt(i))
				{
				    count=1;
					break;
				}					
			}
			if(count==0)
			{
				System.out.println(c1);	
			}
		}			
	}  
}
