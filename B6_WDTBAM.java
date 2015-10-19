import java.util.*;
import java.io.*;
public class B6_WDTBAM {
	public static void main(String args[]) 
	{
		Scanner s1=new Scanner(System.in);
		int t;t=s1.nextInt();
		int n,count;
		int i,j,max;
		//int array[]=new int[1000];
		String str1,str2;
		while(t>0)
		{	
			n=s1.nextInt();count=0;
			str1=s1.next();str2=s1.next();
			int array[]=new int[n+1];
			for(i=0;i<=n;i++)
			{
				array[i]=s1.nextInt();
			}
			for(j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)==str2.charAt(j))
				{count=count+1;}
			}
			max=array[0];
			for(i=0;i<=count;i++)
			{
				if(array[i]>max){max=array[i];}
			}
			if(count==str1.length()){max=array[str1.length()];}
			System.out.println(max);
			
			t--;
		}
		s1.close();
	}
}



