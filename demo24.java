import java.util.Scanner;
class demo24
{
	public static void main(String[] args) 
	{
		int flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data 1");
		String s1=scan.next();
		System.out.println("enter data 2");
		String s2=scan.next();
		if(s1.compareTo(s2)>0)
			{
				System.out.println(s1+"greater than"+s2);
			}
		else if(s1.compareTo(s2)<0)
			{
				System.out.println(s1+"lesser than"+s2);
			}
		else
			{
				System.out.println(s1+"equals"+s2);
			}
		/*for(int index=0;index<s1.length();index++)
		{
			if((int)s1.charAt(index)>(int)s2.charAt(index))
			{
				flag=1;
				break;
			}
			else if((int)s1.charAt(index)<(int)s2.charAt(index))
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			System.out.println(s2+"greater");
		else
			System.out.println(s1+"greater");*/
	}  
}
