import java.util.Scanner;
class demo9
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(char c1='a';c1<='z';c1++)
		{
			for(int i=0;i<s1.length();i++)
			{
				char c2=s1.charAt(i);
				if(c1==c2)
					System.out.println(c1);
			}
			

		}

	}  
}
