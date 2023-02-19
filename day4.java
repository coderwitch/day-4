import java.util.*;
public class Sum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,s=0;
System.out.prinltn("Enter 5 numbers");
for(int i=1;i<=5;i++)
{
a=in.nextInt();
s=s+a;
}
System.out.println(s);
}
}