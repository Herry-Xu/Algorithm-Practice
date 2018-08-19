import java.util.*;
class palindromePerm{

	//Given a string, check it is a Permutation

	public static boolean isPerm(String str1){

		if (str1 == "") {
			return true;
		}

		Hashtable <Character, Integer> hshTable= new Hashtable<>();

		char[] charArr = str1.toCharArray();
		//counts number of unique/odd character
		int counter = 0;

		for (char c1: charArr) {
			if (hshTable.get(c1) == null){
				hshTable.put(c1, 1);
			}
			else{
				hshTable.put(c1, hshTable.get(c1) + 1);
			}
		}

		for (char c1: charArr){
			if (hshTable.get(c1) % 2 != 0){
				counter++;
			}
			if (counter >= 2) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(palindromePerm.isPerm("abab"));
	}
}