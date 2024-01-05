//input a character and output is Ascii value
import java.util.Scanner;
class Demo
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
int asciivalue=c;
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
{
System.out.println(asciivalue);
}
}
}

