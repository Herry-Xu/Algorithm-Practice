class stringPermutation{

	//O(nlogn) could be implemented with sorting. Arrays.sort on a character array uses tuned quicksort in O(nlogn) time
	//O(2n), linear time

	public static boolean checkPerm(String str1, String str2){
		if (str1.length() != str2.length()) {
			return false;
		}
		//checker array is all 0s, can't go negative
		int[] checker = new int[128];
		int current;
		for (int i = 0; i < str1.length(); i++) {
			current = str1.charAt(i);
			checker[current] += 1;
		}

		for (int i = 0; i < str2.length(); i++) {
			current = str2.charAt(i);
			checker[current] -= 1;
			if (checker[current] < 0){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String test1 = " av";
		String test2 = "a v";
		boolean checker = checkPerm(test1, test2);
		System.out.println(checker);
	}
}