import java.util.Scanner;
class demo4
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		char s1=scan.next().charAt(0);
		if((s1== 'a')||(s1=='e')||(s1=='i')||(s1=='o')||(s1=='u'))
			System.out.println("it is vowel");
		else
			System.out.println("it is not vowel");
	}  
}
