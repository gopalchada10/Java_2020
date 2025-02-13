class triangle7
{
public static void main(String[] args)
{
int star1=0; 
int space=10;
int star2=0;
for(int i=1;i<=5;i++)
{
star1++;
star2++;
space=space-2;
for(int j=1;j<=star1;j++)
{
System.out.print("*");
}
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int j=1;j<=star2;j++)
{
System.out.print("*");
}

System.out.println();
}
}
}
