import java.io.*;
import java.util.*;
class alph
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>='a' && ch<='z')
		System.out.print("alphabet");
		else
		System.out.print("not");
	}
}
