class triangle13
{
public static void main(String[] args)
{
int star1=0; 
for(int i=1;i<=3;i++)
{
star1=star1+1;
for(int j=1;j<=star1;j++)
{
if(i%2==0)
System.out.print(1);
else
System.out.print(0);
}
System.out.println();
}
}
}
