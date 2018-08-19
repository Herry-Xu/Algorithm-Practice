// Given an array of integers, return a new array such that each element at index i of the new array 
// is the product of all the numbers in the original array except the one at i.

// For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
// If our input was [3, 2, 1], the expected output would be [2, 3, 6].

// Follow-up: what if you can't use division?

class ProductExceptAtIndex{

	public static int[] productArray(int[] arr){
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] prod = new int[arr.length];

		//construct a left array that contains the product of everything left of the original
		left[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			left[i] = left[i-1]*arr[i-1];
		}

		//construct a right array that contains the product of everything right of the original
		right[arr.length-1] = 1;
		for (int i = arr.length-2; i >= 0; i--){
			right[i] = right [i+1] * arr[i+1];
		}

		for (int i = 0; i < arr.length; i++) {
			prod[i] = left[i]*right[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		int[] test_arr = new int[]{1,2,3,4,5};
		int[] result = productArray(test_arr);
		System.out.println(result[4]);
	}
}