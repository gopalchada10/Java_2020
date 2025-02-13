class triangle4
{
public static void main(String[] args)
{
int star=6; 
int space=-1;
for(int i=1;i<=5;i++)
{
star--;
space++;
for(int k=0;k<=space;k++)
{
System.out.print(" ");
}
for(int j=1;j<=star;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
