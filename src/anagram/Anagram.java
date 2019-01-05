package anagram;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		String s1 = "restful";
		String s2 = "flusler";
		char c1[]= s1.toCharArray();
		char c2[]= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean isAnagram = true; 
		if(s1.length() != s2.length()) {
			isAnagram = false;
		}else {
			for(int i=0;i<s1.length();i++) {
				if(c1[i]!=c2[i]) {
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("Not anagram");
		}
	}

}
