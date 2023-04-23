import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    String s = "*";
	     do {
	    	String s_multi = s.repeat(num);
	    	System.out.println(s_multi);
	    }while(num-- != 0);
  }
}
