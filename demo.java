import java.util.Scanner;
class demo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name");
		String name=scan.next();
		System.out.println("enter age");
		int age=scan.nextInt();
		System.out.println("enter height");
		float height=scan.nextFloat();
		System.out.println("enter 1st letter");
		char letter=scan.next().charAt(0);

		System.out.println("enterrd data");
		System.out.println(name);

		System.out.println(age);

		System.out.println(height);

		System.out.println(letter);


	}
}
