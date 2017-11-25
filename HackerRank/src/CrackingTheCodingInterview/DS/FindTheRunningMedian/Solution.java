package CrackingTheCodingInterview.DS.FindTheRunningMedian;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
         Queue<Integer> left = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg1-arg0;
			}
		});
        Queue<Integer> right = new PriorityQueue<>();
        
        int mid = a[0];
        System.out.printf("%.1f\n", (double)mid);
        for(int i = 1; i < n; i++) {
        	int temp = a[i];
        	if((i & 1) == 1) {
        		if(temp > mid) {
        			right.add(temp);
        			System.out.printf("%.1f\n", (double)(mid + right.peek())/2);
        		}
        		else {
        			left.add(temp);
        			System.out.printf("%.1f\n", (double)(mid + left.peek())/2);
        		}
        	}
        	else {
        		if(temp > mid) {
        			left.add(mid);
        			right.add(temp);
        		}
        		else {
        			right.add(mid);
        			left.add(temp);
        		}
        		if(left.size() > right.size()) {
        			mid = left.poll();
        		}
        		else {
        			mid = right.poll();
        		}
        			
        		System.out.printf("%.1f\n", (double)mid);
        	}
        }
    }
}
