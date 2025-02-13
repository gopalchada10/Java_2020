class multiply 
{
	public static void main(String[] args) 
	{
		multiply(3,4);
		multiply(3,4.4);
		multiply(3.3,4);
		multiply(3,4,5);
	}
	public static void multiply(int a,double b) 
	{
		System.out.println(a*b);
	}
	public static void multiply(int a,int b) 
	{
		System.out.println(a*b);
	}
	public static void multiply(double a,int b) 
	{
		System.out.println(a*b);
	}
	public static void multiply(int a,int b,int c) 
	{
		System.out.println(a*b*c);
	}

}
