import java.util.*;
import java.io.*;
public class DIAMOND {
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
			ans=find1(a);
			{System.out.println(ans);}
		}
	}
	
	public static float find1(float a[])
	{
		float ans=0;
		if(a.length==1)
		{ans=a[0];}
		else if(a.length==2)
		{ans=(float) (0.5*a[0]+0.5*a[1]);}
		else if(a.length>2)
		{
			//ans=(float) (0.5*(a[0]+find1(Arrays.copyOfRange(a, 1, a.length)))+0.5*(a[a.length-1]+find1(Arrays.copyOfRange(a, 0, a.length-1))));
			ans=(float) (0.5*(a[0]+0.5*find1(Arrays.copyOfRange(a, 1, a.length-1))+0.5*find1(Arrays.copyOfRange(a, 2, a.length)))+
						 0.5*(a[a.length-1]+0.5*find1(Arrays.copyOfRange(a, 0, a.length-2))+0.5*find1(Arrays.copyOfRange(a, 1, a.length-1))));
		}
		return ans;
	}
}
