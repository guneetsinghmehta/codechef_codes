class trash1
{
static final int MAX = 10;
public static void main ( String [ ] args )
{
double fi ;
 final double GoldenRatio=(1.0d+Math . sqrt (5) ) / 2.0 ;
for ( int i =0; i<MAX; i++)
{
fi=GoldenRatio *Math.cos ( 2.0 *Math.PI*i /(double)MAX) ;
System . out . println ( "i="+i+" f(i)="+fi ) ;
}
}
}