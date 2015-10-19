import java.util.*;
import java.io.*;
public class exercises1 {
	public static void Q1()
	{
		int time=3800;
		int h,m,s;
		h=time/3600;time=time%3600;
		m=time/60;time=time%60;
		s=time;
		System.out.println("time is="+h+":"+m+":"+s);
	}
	public static void Q2(int time)
	{
		
		int h,m,s;
		h=time/3600;time=time%3600;
		m=time/60;time=time%60;
		s=time;
		System.out.println("time is="+h+":"+m+":"+s);
	}
	public static void Q3(int t1,int t2)
	{
		if(t1>t2){System.out.println("t1 is greater");}
		else
		{
			System.out.println("t2 is greater");
		}
	}
	public static void Q4(int h1,int m1,int s1,int h2,int m2,int s2)
	{
		if((h1>h2)||(h1==h2&&m1>m2)||(h1==h2&&m1==m2&&s1>s2))
		{System.out.println("t1 is greater");}
		else
		{
			System.out.println("t2 is greater");
		}
	}
	public static void main(String args[])
	{
		Q1();
		Q2(3860);
		Q3(34,35);
		Q4(1,2,3,1,2,2);
	}
}
