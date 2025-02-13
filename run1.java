class run1 
{
	public static void test(int a) 
	{
		System.out.println("inside int arg");
	}
	public static void test(char a) 
	{
		System.out.println("inside char arg");
	}
	public static void test(int a,int b) 
	{
		System.out.println("inside int-int arg!");
	}
	public static void test(int a,double b) 
	{
		System.out.println("inside int-double arg!");
	}
	public void test(double a,int b) 
	{
		System.out.println("inside double-int arg!");
		
	}
	public static void main(String args[]) 
	{
		run1 obj=new run1();
		test(5);
		test(5,5.5);
		obj.test(5.5,5);
		test(5,5);
		test('a');
	}
}
