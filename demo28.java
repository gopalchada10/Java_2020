import java.util.Scanner;
class demo28
{
	public static void main(String[] args) 
	{ 
		int rev=0,rem;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int a=n;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println(rev);
			if(rev==a	)
				System.out.println("palindrome");
			else
				System.out.println("not palin");

	}  
}
