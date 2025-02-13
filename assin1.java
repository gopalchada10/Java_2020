class assin1 
{
	public static void main(String[] args) 
	{
		System.out.println("start!");
		run(5);
		assin1 d1=new assin1();
		d1.run("south",5);
	}
	public static void run(int a) 
	{
		System.out.println(a);
	}
	public void run(String a,int b) 
	{
		System.out.println(a+b);
	}
}
