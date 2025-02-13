import java.util.Scanner;
class demo17
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			count++;
			for(int j=0;j<count;j++)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}  
}
