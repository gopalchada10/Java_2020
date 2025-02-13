import java.util.Scanner;
class test3
{
	public static void main(String[] args) 
	{ 
		int rem=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		while(n!=0)
		{
			int prod=1;
			rem=n%10;
			n=n/10;
			for(int i=rem;i>0;i--)
			{
				prod=prod*i;
			}
			System.out.println(prod);

		}
		
	}  
}
