import java.util.Scanner;
class Opt
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n1=scob.nextInt();
int n2=scob.nextInt();
double sum=0;
double dif=0;
double pro=0;
double div=0;
double mod=0;

System.out.println("num1:"+n1);
System.out.println("num2:"+n2);
sum=n1+n2;
dif=n1-n2;
pro=n1*n2;
div=n1/n2;
mod=n1%n2;
System.out.println( n1+"+"+n2+"="+sum);
System.out.println( n1+"-"+n2+"="+dif);
System.out.println( n1+"*"+n2+"="+pro);
System.out.println( n1+"/"+n2+"="+div);
System.out.println( n1+"%"+n2+"="+mod);
}
}