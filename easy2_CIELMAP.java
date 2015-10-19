// not working
import java.util.*;
import java.io.*;
public class easy2_CIELMAP {
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int test_cases=s1.nextInt();
		
		int vertex_numbers;
		int i,m,n,k,p,flag;
		float slope,c,dist;
		float vertex[][]=new float[1000][2];
		for(i=0;i<test_cases;i++)
		{
			vertex_numbers=s1.nextInt();
			for(m=0;m<vertex_numbers;m++)
			{
				vertex[i][0]=s1.nextFloat();vertex[i][1]=s1.nextFloat();
			}
			float max=0;
			for(m=0;m<vertex_numbers-1;m++)
			{
				for(n=m+1;n<vertex_numbers;n++)
				{
					flag=0;
					if(vertex[m][0]==vertex[n][0])
					{
					    for(k=0;k<vertex_numbers;k++)
					    {
					    	for(p=0;p<vertex_numbers;p++)
					    	{
					    		if((vertex[k][0]-vertex[m][0])*(vertex[k][0]-vertex[p][0])<0)
					    		{
					    			flag=1;break;
					    		}
					    	}
					    	if(flag==1){break;}
					    }
					}
					else
					{	
						slope=(vertex[m][1]-vertex[n][1])/(vertex[m][1]-vertex[n][0]);
						c=(vertex[n][0]*vertex[m][1]-vertex[m][0]*vertex[n][1])/(vertex[n][0]-vertex[m][0]);
						for(k=0;k<vertex_numbers;k++)
					    {
					    	for(p=0;p<vertex_numbers;p++)
					    	{
					    		if((vertex[k][1]-slope*vertex[k][0]-c)*(vertex[p][1]-slope*vertex[p][0]-c)<0)
					    		{flag=1;break;}
					    		else
					    		{
					    			dist=(float) Math.sqrt(Math.pow(vertex[m][0]-vertex[n][0], 2)+Math.pow(vertex[m][1]-vertex[n][1], 2));
									if(dist>max){max=dist;}
					    		}
					    	}
					    	if(flag==1){break;}
					    }
					}
					if(flag==0)
					{
						dist=(float) Math.sqrt(Math.pow(vertex[m][0]-vertex[n][0], 2)+Math.pow(vertex[m][1]-vertex[n][1], 2));
						if(dist>max){max=dist;}
					}
					
				}
			}
			System.out.println("max distance"+max);
		}
	}
	
}
