import java.util.Scanner;
class test6
{
	public static void main(String[] args) 
	{ 
		int star=0;
		int space=4;
		int space2=-2;
		for(int i=1;i<=4;i++)
		{
			star=star+1;
			space--;
			space2=space2+2;
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(j);
			}
			for(int j=star;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}  
}
