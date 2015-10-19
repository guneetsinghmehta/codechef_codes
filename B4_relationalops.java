import java.util.*;
import java.io.*;
public class B4_relationalops {
	public static void main(String args[])throws Exception 
	{
		Scanner s1=new Scanner(System.in);
		int t;t=s1.nextInt();
		long n,k;
		char c=' ';
		while(t>0)
		{
			
			n=s1.nextInt();k=s1.nextInt();
			if(n>k){c='>';}
			else if(n<k){c='<';}
			else if(n==k){c='=';}
			System.out.println(c);
			t--;
		}
		s1.close();
	}
}



