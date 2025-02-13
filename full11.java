class full11
{
public static void main(String[] args)
{
int star=0;
int space=5;
int star2=0;
int i;
for(i=1;i<=9;i++)
{
if(i<=5)
{
star=star+1;
star2=star2+1;
space=space-1;
}
else
{
star=star-1;
star2=star2-1;
space=space+1;
}
for(int k=1;k<=space;k++)
{
System.out.print(" ");
}
for(int j=1;j<=star;j++)
{
System.out.print("*");
}
if(i==4||i==5||i==6)
{
for(int p=1;p<10;p++)
System.out.print("*");
}
else
for(int p=1;p<10;p++)
System.out.print(" ");
for(int j=1;j<=star2;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}