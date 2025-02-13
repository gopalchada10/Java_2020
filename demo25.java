import java.util.Scanner;
class demo25
{
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		if(n>=2)
		{
			int factor=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					factor++;
			}
			if(factor==2)
				System.out.println(n+"prime no");
			else
				System.out.println(n+"not prime no");

		}
		
	}  
}
