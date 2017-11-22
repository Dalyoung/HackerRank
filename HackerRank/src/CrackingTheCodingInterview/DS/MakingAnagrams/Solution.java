package CrackingTheCodingInterview.DS.MakingAnagrams;

import java.util.Scanner;

public class Solution {

	public static int numberNeeded(String first, String second) {
		int ret = 0;
		int count1[] = new int[26];


		for(int i = 0; i < first.length(); i++){
			count1[first.charAt(i) - 'a']++;
		}

		for(int i = 0; i < second.length(); i++){
			count1[second.charAt(i) - 'a']--;
		}

		for(int i = 0; i < count1.length; i++) {
			ret += Math.abs(count1[i]);
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
