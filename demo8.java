import java.util.Scanner;
class demo8
{
	public static void main(String[] args) 
	{
		int flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data 1");
		String s1=scan.next();
		System.out.println("enter data 2");
		String s2=scan.next();
		for(int index=0;index<s1.length();index++)
		{
			if(s1.charAt(index)==s2.charAt(index))
				flag=1;
			else
				flag=0;		
		}
		/*
		if(s1.equals(s2))		//if(s1.equalsIgnoreCase(s2)) for not considering upper or lower case i.e output is similar for upper and lower casr inputs too
			System.out.println("similar");
		else
			System.out.println("not similar");
		*/
		if(flag==0)
			System.out.println("not similar");
		else
			System.out.println("similar");
	}  
}
