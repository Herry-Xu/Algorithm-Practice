//Check if two Strings are one operation away from being the same;
//operations include delete, insert, and replace

class OneAway{

  public static boolean checkReplace(String str1, String str2){
    int counter = 0;
    if (str1.length() == 0){
      return true;
    }
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == str2.charAt(i)){
        continue;
      }
      else if(str1.charAt(i) != str2.charAt(i)){
        counter++;
        if (counter <= 1) {
          continue;
        }
        return false;
      }
    }
    return true;
  }

  public static boolean checkInsertDelete(String longStr, String shortStr){
    
    int counter = 0;
    int indexLong = 0, indexShort = 0;

    while (indexLong < longStr.length() && indexShort < shortStr.length()){
      if(shortStr.charAt(indexShort) == longStr.charAt(indexLong)){
        indexLong++;
        indexShort++;
        continue;
      }
      else if (shortStr.charAt(indexShort) != longStr.charAt(indexLong)) {
        counter++;
        if (counter <= 1) {
          indexLong++;
          continue;
        }
        return false;
      }
    }

    return true;
  }

  public static boolean checkOneAway(String str1, String str2){

    if (Math.abs(str1.length() - str2.length()) >= 2){
      return false;
    }
    if (str1.length() == str2.length()){
      return checkReplace(str1, str2);
    }
    else{
      if (str1.length() > str2.length())
        return checkInsertDelete(str1, str2);
      else
        return checkInsertDelete(str2, str1);
    }
  }

  public static void main(String[] args) {
    boolean result = checkOneAway(args[0], args[1]);
    System.out.println(result);
  }
}