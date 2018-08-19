import java.util.*;
class HashTables{
	public static void main(String[] args) {
		Hashtable <String, Integer> hash = new Hashtable<>();
		hash.put("Anthony", 52);
		hash.put("Geng", 21);
		hash.put("Herry", 65);
		System.out.println(hash);
		System.out.println(hash.get("Geng"));
	}
}