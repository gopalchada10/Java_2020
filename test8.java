class test8
{
	public static void main(String[] args) 
	{ 
		int star=0,k=0;
		for(int i=1;i<=4;i++)
		{
			star++;
			char z='z';
			for(int j=1;j<=star;j++,z--)
			{
				k++;
				System.out.print(k+""+z);
			}				
			System.out.println("");
		}
	}  
}
