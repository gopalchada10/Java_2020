class full6
{
public static void main(String[] args)
{
int star=6;
int space=-2;
int star2=6;
for(int i=1;i<=9;i++)
{
if(i<=5)
{
star=star-1;
space=space+2;
star2=star2-1;
}
else
{
star=star+1;
space=space-2;
star2=star2+1;
}
for(int j=1;j<=star;j++)
{
System.out.print("*");
}
for(int k=1;k<=space;k++)
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
