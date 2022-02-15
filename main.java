/******************************************************************************

                            Coded by WanZ

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int to_count = 0;
	int length = 0;
	ArrayList<Integer> number_list = new ArrayList<Integer>(100);
	int test_array[] = {};
	for (var i = 1; i <= 100; i++)  {
	    if (i%6 == 0)  {
	       to_count += i;
	       length++;
	       number_list.add(i);
	      
	    }
	}
	System.out.println("Number that dividable by 6 is: " + number_list + "\nAverage is: " + (to_count/length));

		
		
	}
}
