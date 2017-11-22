package CrackingTheCodingInterview.DS.RansomNote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		Map<String, Integer> map = new HashMap<>();
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			magazine[magazine_i] = in.next();
			if(map.containsKey(magazine[magazine_i])){

				map.put(magazine[magazine_i], map.get(magazine[magazine_i]) + 1);
			}
			else{
				map.put(magazine[magazine_i], 1);    
			}
		}
		String ransom[] = new String[n];
		boolean chk = true;
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			ransom[ransom_i] = in.next();

			if(map.containsKey(ransom[ransom_i])){
				int temp = map.get(ransom[ransom_i]);
				if(temp == 1){
					map.remove(ransom[ransom_i]);    
				}
				else{
					map.put(ransom[ransom_i], temp - 1);
				}
			}
			else{
				System.out.println("No");
				chk = false;
				break;
			}
		}
		if(chk){
			System.out.println("Yes");
		}
	}
}
