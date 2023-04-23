import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner In = new Scanner(System.in);
		int numInt = In.nextInt();
		
		int numArr[] = new int[numInt];
		int count = 0;
		
		do {
			int num = In.nextInt();
			numArr[count] = num;
			count++;
		}while(count != numInt);
		
		int maxcount = 0;
		int modenum = 0;
		
		for(int i = 0; i < numInt; i++) {
			int dupecount = 0;
			for(int x = 0; x < numInt; x++) {
				if (numArr[i] == numArr[x]) {
					dupecount++;
				}
			}
			if (dupecount > maxcount) {
				maxcount = dupecount;
				modenum = numArr[i];
			}
		}
		System.out.println(modenum);
    
  }
}
