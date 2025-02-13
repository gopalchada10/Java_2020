import java.util.Scanner;
class demo20
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
				char ch=s1.charAt(i);
				s2=s2+ch;
		}
		if(s1.equals(s2))
			System.out.println("palin");
		else
			System.out.println("not palin");
			
	}  
}
