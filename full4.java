class full4
{
public static void main(String[] args)
{
int star=11;
int space=-1;
for(int i=1;i<=9;i++)
{
if(i<=5)
{
star=star-2;
space++;
}
else
{
star=star+2;
space--;
}
for(int k=1;k<=space;k++)
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
