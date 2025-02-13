import java.util.Scanner;
class demo30
{
	public static void main(String[] args) 
	{ 
		int sum=0,rem,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int a=n;
			while(n!=0)
			{
				rem=n%10;
				sum=sum+rem;
				n=n/10;
				count++;
			}
			System.out.println(count);

	}  
}
