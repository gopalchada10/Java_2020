class DemoTest
{
	public static void main(String[] args) 
	{
		if(args.length>0)
		{
			System.out.println("array length : "+args.length);
			for(String k : args)
			{
				System.out.println(k);
			}
		}
		else
		{
			System.out.println("array length : "+args.length);
			System.out.println("empty array");
		}
	}
}
