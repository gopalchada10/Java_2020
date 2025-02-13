import java.util.Scanner;
class demo14
{
	public static void main(String[] args) 
	{
		int flag=0;
		int count=0,count1=0,count2=0,count3=0,count4=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				count++;
			}
			else if(s1.charAt(i)=='a')
				count1++;
			else if(s1.charAt(i)=='i')
				count2++;
			else if(s1.charAt(i)=='o')
				count3++;
			else if(s1.charAt(i)=='u')
				count4++;
				
		}
		if(count>0)
			System.out.println("a"+count);
		if(count1>0)
			System.out.println("e"+count1);
		if(count2>0)
			System.out.println("i"+count2);
		if(count3>0)
			System.out.println("o"+count3);
		if(count4>0)
			System.out.println("u"+count4);

	}  
}
