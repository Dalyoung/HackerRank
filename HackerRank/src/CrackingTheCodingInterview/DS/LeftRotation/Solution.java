package CrackingTheCodingInterview.DS.LeftRotation;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int ret[] = new int[n];
		for(int i = 0; i < n; i++){
			ret[(i-k+n) % n] = a[i];
		}

		for(int num : ret){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
