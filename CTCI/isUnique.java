class isUnique{

	public static boolean isUnique(String str){
		//Ask for ASCII or Unicode
		if (str.length() > 128) {
			return false;
		}

		boolean[] arr = new boolean[128];
		//check if character has been found before
		for (char c1:str.toCharArray()){
			if (arr[c1] == true){
				return false;
			}
			else
				arr[c1] = true;
		}
		return true;
	}

	//Reduce space usage by a factor of 8 
	//Uses 4 bytes instead of 32 bytes
	public static boolean isUniqueBitVector(String str){
		//holds up to 32 bits
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker = checker | (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = new String("abdfe");
		String str2 = new String("abdesdsa");

		System.out.println(isUniqueBitVector(str1));
		System.out.println(isUniqueBitVector(str2));
	}
}