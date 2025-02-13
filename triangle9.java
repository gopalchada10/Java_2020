class triangle9
{
public static void main(String[] args)
{
int star1=-1; 
int space=5;
for(int i=1;i<=5;i++)
{
star1=star1+2;
space--;

for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int j=1;j<=star1;j++)
{
if(j%2==0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
