import java.util.*;
import java.io.*;
public class B7_MSTEP
{
	public int x_pos;
	public int y_pos;
	
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int t,n;int i,j,result=0;
		t=s1.nextInt();
		while(t-->0)
		{
			n=s1.nextInt();
			int array[][]=new int[n][n];
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					array[i][j]=s1.nextInt();
				}
			}
			
			result=solve(array);
			System.out.println(result);
		}
	}
	public static int solve(int array[][])
	{
		int result=0;
			int i,j;
			B7_MSTEP p1=new B7_MSTEP();B7_MSTEP p2=new B7_MSTEP();
			p1=get_position(array,1);
			p2=get_position(array,1);
			//System.out.println(p1.x_pos);
			//System.out.println(p1.y_pos);
			int next=1;
			for(i=0;i<array.length;i++)
			{
				for(j=0;j<array[0].length;j++)
				{
					if(i==0&&j==0){continue;}
					next++;
					p2=get_position(array,next);
					result+=dist(p1,p2);
				}
			}
		return result;
	}
	
	public static int dist(B7_MSTEP p1,B7_MSTEP p2)
	{
		int result=0;
		result=Math.abs(p1.x_pos-p2.x_pos)+Math.abs(p1.y_pos-p2.y_pos);
		return result;
	}
	
	public static B7_MSTEP get_position(int array[][],int input)
	{
		B7_MSTEP a1=new B7_MSTEP();
		a1.x_pos=1;a1.y_pos=1;
		int i,j;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array[0].length;j++)
			{
				if(array[i][j]==input)
				{
					a1.x_pos=i;a1.y_pos=j;
				}
			}
		}
		return a1;
	}
	
}
