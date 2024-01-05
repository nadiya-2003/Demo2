import java.util.Scanner;
class Sub
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n1=scob.nextInt();
int n2=scob.nextInt();


if(n1<n2)
{

System.out.println( n2-n1 );
}
else
{

System.out.println( n1-n2 );
}
}
}
