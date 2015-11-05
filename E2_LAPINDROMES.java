import java.util.*;
import java.io.*;
public class E2_LAPINDROMES {
	public static void main(String args[])
	{
		int i,j,k,t;
		int temp;
		Scanner s1=new Scanner(System.in);
		t=s1.nextInt();
		String str,ans;
		int[] c1=new int[26];int c2[]=new int[26];
		for (k=0;k<t;k++)
		{
			str=s1.next();
			for(i=0;i<26;i++)
			{
				c1[i]=0;c2[i]=0;
			}
			for(i=0;i<=Math.floor(str.length()/2)-1;i++)
			{
				temp=(int)str.charAt(i)-97;
				c1[temp]+=1;
			}
			if(str.length()%2==1)
			{
				for(i=(int) Math.floor(str.length()/2)+1;i<=str.length()-1;i++)
				{
					temp=(int)str.charAt(i)-97;
					c2[temp]+=1;
				}
			}
			else
			{
				for(i=(int) Math.floor(str.length()/2);i<=str.length()-1;i++)
				{
					temp=(int)str.charAt(i)-97;
					c2[temp]+=1;
				}
			}
			
			ans="Yes";
			for (i=0;i<26;i++)
			{
				if(c1[i]!=c2[i])
				{ans="No";break;}
			}
			System.out.println(ans);
		}
	}
	
}
