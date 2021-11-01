package ArrayParallelSort;

import java.util.Arrays;

public class SpecifyStartAndEndIndex {
	public static void main(String[] args) {
		int numbers[]= {22,89,1,32,19,5};
		/*Specifying the start and end index. The start index is
		 * 1 here and the end index is 4. Which means the elements
		 * starting from index 1 till index 4 would be sorted.
		 */
		Arrays.parallelSort(numbers,1,5);
		
		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		System.out.println();
		for(int a:numbers)
			System.out.println(a);
		
	}
}
