package leetcode;

import java.util.PriorityQueue;

public class BigInt {
	int Sum(int[] nums, int n){
		if(n == 0){
			return nums[n];
		}
		return nums[n] + Sum(nums, n-1);
	}
	
	 public static void main(String[] args) {
		int[] nums = {1,3,3,4,5,6,7,8,9};
		BigInt test = new BigInt();
		System.out.println(test.Sum(nums, nums.length - 1));
	}
}
