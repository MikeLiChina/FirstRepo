/**
*name:accept from standard input, output random number between scope
*param1:number
*param2:down limit
*param3:up limit
*/

import edu.princeton.cs.algs4.*;
public class E_1_193
{

public static void main(String[] args)
{
    //int num,lo,hi,n;
	int num,n;
	
	double lo,hi,rand;
    n=1;
    num=Integer.parseInt(  args[0]);
	//lo=Integer.parseInt( args[1]);
	//hi=Integer.parseInt(args[2]);
	lo=Double.parseDouble(args[1]);
	hi=Double.parseDouble(args[2]);

    

    /**StdRandom.uniform
	*int StdRandom.uniform(int,int)
	*double StdRandom.uniform(double,double)
	*/
	while(n<=num)
	{
	    rand=StdRandom.uniform(lo,hi);
	    StdOut.printf("%.2f\n",rand);
		n++;
	}
}

}
