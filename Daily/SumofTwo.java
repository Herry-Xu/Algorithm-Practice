// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
// Bonus: Can you do this in one pass?

import java.util.Arrays;

public class SumofTwo{

	/*
	1. sort the array in ascdening
	2. have a starting index and an ending index
	3. check if two number sum up to target from the two indexes
	4. if too high, decrease end index; if too low, increase start index
	5. if indexes are equal, return false
	*/

	public boolean checkSum (int[] arr, int target){
		int[] sorted = arr;
		Arrays.sort(sorted);
		int start = 0;
		int end = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (start == end) {
				break;
			}
			else if (sorted[start] + sorted[end] == target){
				return true;
			}
			else if (sorted[start] + sorted[end] > target){
				end--;
			}
			else if (sorted[start] + sorted[end] < target) {
				start++	;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		SumofTwo s1 = new SumofTwo();
		int[] test_arr = new int[]{5,6,2,8,9};
		System.out.println(s1.checkSum(test_arr, 6));
	}
}