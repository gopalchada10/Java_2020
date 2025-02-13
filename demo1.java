import java.util.Scanner;
class demo1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter data");
		String s1=scan.next();
		System.out.println("enter index");
		int index=scan.nextInt();
        char ch=s1.charAt(index);
		System.out.println("character present at "+index+"is"+ch);
	}  
}
