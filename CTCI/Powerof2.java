class Powerof2{

	//use bit manipulation
	public static boolean isPowerof2(int num){
		if ((num & num - 1) == 0){
			return true;
		}
		return false;
	}

	//Get biggest power of 3 that can be stored in an integer and mod it by the num.
	//If not a power of 3, the mod will not be 0
	public static boolean isPowerof3(int num){
		if (Math.pow(3,20) % num == 0){
			return true;
		}
		return false;

		// while (num % 3 == 0){
		// 	num /= 3;
		// 	if (num == 1){
		// 		return true;
		// 	}
		// }
		// return false;
	}

	//Get biggest power of 4, same as last question
	//Then subtract 1 from the num and see if it is a multiple of 3
	public static boolean isPowerof4(int num){
		if (Math.pow(4,16) % num == 0 && (num-1) % 3 == 0){
			return true;
		}
		return false;
	}

	//using log, all log of base 4 is going be an integer
	//using identity Logb(n) = Loge(n)/Loge(b)
	public static boolean isPowerof4Log(int num){
		double logNum = Math.log(num)/Math.log(4) % 4;
		if (logNum == (int)logNum){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean checker = isPowerof4(64);
		boolean check2 = isPowerof4Log(63);
		System.out.println(checker);
		System.out.println(check2);

	}
}