import java.util.Scanner;
class demo18
{
	public static void main(String[] args) 
	{
		int count=-1;
		int space=5;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=1;i<6;i++)
		{
			count=count+2;
			space--;
			for(int k=1;k<=space;k++)
				System.out.print(" ");

			for(int j=0;j<count;j++)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}  
}
