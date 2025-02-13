import java.util.Scanner;
class demo21
{
	public static void main(String[] args) 
	{
		int flag=0;
		int z=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		System.out.println("enter char");
		char s=scan.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s)
			{			 
				flag=1;
				z=i;
				System.out.println(s+"is present in"+s1+"at"+z);
				
			}
			else
				flag=0;
		}
		if(flag==0)
				System.out.println("-1");
		
	}  
}
