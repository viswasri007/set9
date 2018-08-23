import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		char t;
		char ch[]=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]>ch[j])
				{
					t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
	
		for(int k=0;k<len;k++)
		System.out.print(ch[k]);
	}
}
