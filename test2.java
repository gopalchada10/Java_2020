import java.util.Scanner;
class test2
{
	public static void main(String[] args) 
	{ 
		int count=0,count1=0;
		for(int i=10;i<=70;i++)
		{
			if(i%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println(count+"even");
		System.out.println(count1+"odd");	
	}  
}
