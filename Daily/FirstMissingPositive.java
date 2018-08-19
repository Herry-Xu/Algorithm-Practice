import java.util.*;

// Given an array of integers, find the first missing positive integer in linear time and constant space. 
// In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
// You can modify the input array in-place.

class FirstMissingPositive{

	public static int getFirstMissingPos(int[] arr){
		Arrays.sort(arr);
		int counter = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				continue;
			}
			else if (arr[i] == counter){
				counter++;
			}
			else{
				return counter;
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		int count = getFirstMissingPos(new int[]{-5,0,2,3});
		System.out.println(count);
	}
}