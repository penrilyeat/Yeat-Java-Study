package ArrayParallelSort;

import java.util.Arrays;

public class SortPrimitiveData {
	public static void main(String[] args) {
		int numbers[]= {22,89,1,32,19,5};
		//Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n->System.out.println(n));
	}
}
