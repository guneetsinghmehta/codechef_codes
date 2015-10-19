import java.util.*;
import java.io.*;
public class B4_DEVUGRAP {
	public static void main(String args[])throws Exception 
	{
		Scanner s1=new Scanner(System.in);
		int t;t=s1.nextInt();
		int i,j,n,k,num,ops;
		while(t>0)
		{
			//change in branch1
			//Change 2
			ops=0;
			n=s1.nextInt();k=s1.nextInt();
			for(i=0;i<n;i++)
			{
				num=s1.nextInt();
				if(num>=k)
				{ops=ops+Math.min(num%k, k-num%k);}
				else
				{ops=ops+k-num; }
			}
			System.out.println(ops);
			t--;
		}
		s1.close();
	}
	
	public void  f1()
	{
		//empty function
	}


	public void  f3()
	{
		//function in master
	}
	
	public void  f2()
	{
		//function in branch2

	}
}


