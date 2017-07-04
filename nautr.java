import java.io.*;
import java.util.*;
class nautr
{
    public static void main(String args[])
    {
        int a,i;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int sum=0;
        for(i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
