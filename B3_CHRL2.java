import java.util.*;
import java.io.*;
public class B3_CHRL2 {
	public static void main(String args[])throws Exception 
	{
		Scanner s1=new Scanner(System.in);
		int t;//t=s1.nextInt();
		t=1;
		int i,count;count=0;
		String temp=new String();
		String template="CHEF";int template_index=0;
		while(t>0)
		{
			temp=s1.next();count=0;
			for(i=0;i<temp.length();i++)
			{
				if(temp.charAt(i)==template.charAt(template_index))
				{template_index++;if(template_index==template.length()){count=count+1;template_index=0; }}
			}
			System.out.println(count);
			t--;
		}
		s1.close();
			
	}
}
