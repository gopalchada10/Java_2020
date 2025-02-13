import java.util.Scanner;
class demo16
{
	
	public static void main(String[] args) 
	{ 
		int count=0,count1=0,count2=0,count3=0,count4=0;	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			switch(ch)
			{
				case 'a':count++;
				break;
				case 'e':count1++;
				break;
				case 'i':count2++;
				break;
				case 'o':count3++;
				break;
				case 'u':count4++;
				break;



			}
				
			
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
