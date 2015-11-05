import java.util.*;
import java.io.*;
public class E3_DOWNLOAD {
	public static void main(String args[])
	{
		int N,Q,K,i,j,k;
		int ans;
		Scanner s1=new Scanner(System.in);
		N=s1.nextInt();
		int S[]=new int[N];int E[]=new int[N];
		int Flag[]=new int[N];
		int visit;
		for(i=0;i<N;i++)
		{
			S[i]=s1.nextInt();E[i]=s1.nextInt();
		}
		//optimize below
		Q=s1.nextInt();
		for(k=0;k<Q;k++)
		{
			for(i=0;i<Flag.length;i++)
			{Flag[i]=0;}
			ans=0;
			K=s1.nextInt();
			for(j=0;j<K;j++)
			{
				visit=s1.nextInt();
				for(i=0;i<S.length;i++)
				{
					if(Flag[i]==0&&visit>=S[i]&&visit<=E[i]){Flag[i]=1;}
				}
			}
			for(i=0;i<Flag.length;i++)
			{if(Flag[i]==1){ans++;}}
			System.out.println(ans);
		}
	}
}
