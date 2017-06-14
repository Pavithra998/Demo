import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int factorial=n;
for(int i=(n-1);i>1;i--)
{
  factrual=factorial*i;
}
System.out.println("factorial");
}
}
