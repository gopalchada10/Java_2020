import java.util.Scanner;
class demo27
{
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
			for(int i=1;i<=3;i++)
			{
				rem=n%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println("reversed no is"+rev);
	}  
}
