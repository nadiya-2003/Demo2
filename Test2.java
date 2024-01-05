//unary not operator
import java.util.Scanner;
class Test2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
boolean cond=true;
int a=scob.nextInt();
int b=scob.nextInt();;
//Displaying values stored in above variables
System.out.println("Cond is:"+cond);
System.out.println("var1="+a);
System.out.println("var2="+b);
System.out.println("Now Cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}
