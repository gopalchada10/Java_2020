import java.util.Scanner;
class demo27
{
	public static void main(String[] args) 
	{ 
		int rev=0,rem;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println("reversed no is"+rev);
	}  
}
