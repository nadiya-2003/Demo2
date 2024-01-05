import java.util.Scanner;
public class RelaionalOperators1
{
public static void main(String args[])
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter First Number:");
int num1=scan.nextInt();
System.out.println("Enter Second Number:");
int num2=scan.nextInt();
System.out.println("Enter Third Number:");
int num3=scan.nextInt();
if((num1>num2) && (num1>num3))
System.out.println("The greatest number is="+num1);
}

   else if((num2>num1)&&(num2>num3))
    {
      System.out.println("The greatest number is="+num2);
     }


else
{
 System.out.println("The greatest number is="+num3);
}

}
}