import java.util.Scanner;
class test1
{
	public static void main(String[] args) 
	{
		int prod=1;
			for(int i=50;i<=100;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					prod=prod*i;
				}			
			}
			System.out.println(prod);							
	}  
}

