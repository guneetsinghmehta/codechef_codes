// not working
import java.util.*;
import java.io.*;
public class Beginner1_MNMX {
	public static void main(String args[]){
	Scanner s1=new Scanner(System.in);
	int t,i,j,array_size,min,temp;min=0;
	t=s1.nextInt();
	for(i=0;i<t;i++)
	{
		array_size=s1.nextInt();
		for(j=0;j<array_size;j++)
		{	temp=s1.nextInt();
			if(j==0){min=temp;}
			else
			{
				if(temp<min){min=temp;}
			}
		}
		System.out.println(min*(array_size-1));
	}
}
}
