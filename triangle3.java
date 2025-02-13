class triangle4
{
public static void main(String[] args)
{
int star=5; 
int space=0;
for(int i=1;i<=4;i++)
{
star++;
space++;
for(int k=1;k<=space;k--)
{
System.out.print(" ");
}
for(int j=5;j<=star;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}
