import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if((i+1)%2==1)
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.print(" ");
		for(int i=0;i<str.length();i++)
		{
			if((i+1)%2==0)
			{
				System.out.print(str.charAt(i));
			}
		}
		
	}
}
