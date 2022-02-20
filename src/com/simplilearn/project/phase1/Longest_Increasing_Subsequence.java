package com.simplilearn.project.phase1;

import java.util.HashSet;

public class Longest_Increasing_Subsequence {
	

		public static void main(String[] args) {
			int[] arr= {4,2,7,12,89,45,34};
			HashSet<Integer>hs=new HashSet<>();
			for(int i=0;i<arr.length;i++) {
				hs.add(arr[i]);
			}
			int long_len=0;
			for(int i=0;i<arr.length;i++) {
				if(!hs.contains(arr[i]-1)) {
					int num=arr[i];
					while(hs.contains(num)) {
						num++;
					}
					if(long_len<num-arr[i]) {
						long_len=num-arr[i];					}
					}
				}
			System.out.println("Longest SubSequences length is: "+long_len);
		}

}
