class urlLify{

	static void replaceSpaces(char[] str, int trueLength){
		int spaceCount = 0;
		int index;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2 - 1;
		if (trueLength < str.length) {
			str[trueLength] = '\0';
		}

		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index = index - 3;
			}
			else{
				str[index] = str[i];
				index--;
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "Mr John Smith    ";
		char[] c1 = s1.toCharArray();
		// for (int i = 0; i < c1.length; i++) {
		// 	System.out.println(c1[i]);
		// }
		replaceSpaces(c1, 13);
		String s2 = new String(c1);
		System.out.println(s2);
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
	}
}