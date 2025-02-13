import java.util.Scanner;
class demo26
{
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=scan.nextInt();
		if(n>=2)
		{
			int a=0;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int i=1;i<=n-2;i++)
			{
				int c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
		else if(n==1)
				System.out.println("0");
		else
				System.out.println("invalid");
		
	}  
}
