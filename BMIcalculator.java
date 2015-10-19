/** This class allows you to calculate the  <u>BMI</u> using the inputs:
   * <ul>
   * <li> weight; </li>
   * <li> height. </li>
   * </ul>
   * See <a href="http://en.wikipedia.org/wiki/Body_mass_index"<Wikipedia</a> for
   * more information.
   * @author Bart Baesens
   */
import java.*;
import java.util.Scanner;
public class BMIcalculator {
	double height;double weight;double bmi;
	public BMIcalculator(double w,double h)
	{weight=w;height=h;}
	public double calculatebmi()
	{
		return(weight/(height*height));
	}
	public static void main(String args[])
	{
		BMIcalculator a1=new BMIcalculator(60,2);
		double ans2;
		a1.bmi=a1.calculatebmi();
		System.out.println("bmi="+a1.bmi);
		
		float w[]={100,100,100,100,100};
		float h[]={2,2,2,2,2};
		float bmi[]=new float[5];
		int i;
		for (i=0;i<5;i++)
		{
			bmi[i]=w[i]/(h[i]*h[i]);
			System.out.println((i+1)+"'s bmi="+bmi[i]);
		}
		Scanner k1=new Scanner(System.in); 
		int val=k1.nextInt();
		System.out.println(val);
			
	}
	
}
