class full5
{
public static void main(String[] args)
{
int star=0;
int space=8;
int star2=0;
for(int i=1;i<=7;i++)
{
if(i<=4)
{
star++;
star2++;
space=space-2;
}
else
{
star--;
star2--;
space=space+2;
}
for(int k=1;k<=star;k++)
{
System.out.print("*");
}
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int k=1;k<=star2;k++)
{
System.out.print("*");
}
System.out.println();
}

}
}
