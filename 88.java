import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();int t=1;
		if(n==1 && m==1)
		{
			System.out.println(n);
		}
		else
		{
		for(int i=1;i<=m*n;i++)
		{
			if(i%n==0 && i%m==0)
			{
				System.out.println(i);
				break;
			}
			
		}
		}
	}
}
