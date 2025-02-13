import java.util.Scanner;
class demo32
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
				count++;
			   if(count==3)
				{
				rem=n%10;
				sum=rem*rem*rem;
				n=n/10;
				System.out.println(sum);

				}
				/*else if(count==3)
				{
				rem=n%10;
				sum=rem*rem*rem;
				n=n/10;
				System.out.println(sum);

				}*/
			}
	}  
}
