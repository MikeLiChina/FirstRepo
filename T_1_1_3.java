import edu.princeton.cs.algs4.*;

public class T_1_1_3
{
    public static void main(String[] args)
	{
	    int arg1=Integer.parseInt(args[0]);
	    int arg2=Integer.parseInt(args[1]);
	    int arg3=Integer.parseInt(args[2]);

		if(arg1==arg2&&arg1==arg3)
		{
		    StdOut.printf("equal");
		}
		else
		{
		    StdOut.printf("not equal");
		}
	}
}
