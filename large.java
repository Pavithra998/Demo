import java.io.*;
import java.util.*;
class large
{
    public static void main(String args[])
    {
        int n;
        int a[]=new int[3];
        int max=a[0];
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<a.length;i++)
        {
            a[i]=s.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(max);
    }
}
