import java.util.*;
import java.io.*;
public class B5_CHEFSTLT{
	public static void main(String args[])throws Exception 
	{
		Scanner s1=new Scanner(System.in);
		int t;t=s1.nextInt();
		int i,qs,min,max;
		String str1,str2;
		while(t>0)
		{
			str1=s1.next();str2=s1.next();
			min=0;qs=0;
			for(i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i)&&str1.charAt(i)!='?'&&str2.charAt(i)!='?')
				{min=min+1; }
				if(str1.charAt(i)=='?'||str2.charAt(i)=='?')
				{qs=qs+1;}
			}
			System.out.format("%d ",min);
			System.out.println(min+qs);
			t--;
		}
		s1.close();
	}
}



