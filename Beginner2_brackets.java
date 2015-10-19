import java.util.*;
import java.io.*;
public class Beginner2_brackets {
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String temp=new String();
		temp="(()";
		//System.out.println(temp);
		int t;t=s1.nextInt();
		while(t>0)
		{	
			temp=s1.next();
			int i;int max=0;int count;
			count=0;
			for(i=0;i<temp.length();i++)
			{
				if(temp.charAt(i)=='(')
				{count=count+1; }
				else if(temp.charAt(i)==')')
				{count=count-1;}
				if(count>max){max=count;}
			}
			for(i=0;i<2*max;i++)
			{
				if(i<max)System.out.print('(');
				else System.out.print(')');
			}
			System.out.println();
			t--;
		}
		
	}
}
