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
		for(int i=1;i<n*m;i++)
		{
			if(n%i==0 && m%i==0 && t<i)
			{
				t=i;
			}
		}
		System.out.print(t);
	}
}
