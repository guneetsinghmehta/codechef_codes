import java.util.*;
import java.io.*;
public class E1_DIAMOND {
	public static void main(String args[])
	{
		int t,i,j,k;
		int n;float ans;
		Scanner s1=new Scanner(System.in);
		t=s1.nextInt();
		for(k=0;k<t;k++)
		{
			n=s1.nextInt();
			float a[]=new float[n];
			
			for(j=0;j<n;j++)
			{a[j]=(float)s1.nextInt();}
			/*
			float sub1[]=Arrays.copyOfRange(a, 1, a.length);
			float sub2[]=Arrays.copyOfRange(a, 0, a.length-1);
			
			for(j=0;j<sub1.length;j++)
			{
				System.out.println(sub1[j]);
			}
			System.out.println();
			for(j=0;j<sub2.length;j++)
			{
				System.out.println(sub2[j]);
			}*/
			ans=find1(a,0,a.length-1);
			{System.out.println(ans);}
		}
	}
	
	public static float find1(float a[],int first,int last)
	{
		float ans=0;float part1,part2;part1=0;part2=0;
		if(first==last)
		{ans=a[first];}
		else if(last-first==1)
		{ans=(float) (0.5*a[first]+0.5*a[last]);}
		else 
		{
			part1=(float) (0.5*(a[0]+0.5*find1(a,1,a.length-2)+0.5*find1(a,2,a.length-1)));
			part2=(float) (0.5*(a[a.length-1]+0.5*find1(a,0,a.length-3)+0.5*find1(a,1,a.length-2)));
			ans=part1+part2;
		}
		return ans;
	}
}
