import java.util.Scanner;
class demo19
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(i!=0&&i!=s1.length()-1)
			{
				char ch=s1.charAt(i);
				s2=s2+ch;
			}
		}
		System.out.println((s1.charAt(s1.length()-1))+s2+(s1.charAt(0)));
	}  
}
