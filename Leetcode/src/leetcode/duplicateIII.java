package leetcode;

import java.util.TreeSet;

public class duplicateIII {
	boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0){
            return false;
        }
        
        TreeSet<Integer> set = new TreeSet<Integer>(); 
        
        //floor(c) 返回离c最近的最大值 ,在加入之前判断。所以重复与否不会受影响。
        //ceiling(c) 返回离c最近的最小值
        for(int i = 0; i < nums.length; i++){
            if((set.ceiling(nums[i]) != null && set.ceiling(nums[i]) <= nums[i] + t) || (set.floor(nums[i]) != null && set.floor(nums[i]) >= nums[i] - t)){
                return true;
            }
            set.add(nums[i]);
            if(i >= k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
	public static void main(String[] args) {
//		duplicateIII test = new duplicateIII();
//		int[] nums = {1,1,1,1,6,6,6,6,11,11,11,11};
//		System.out.println(test.containsNearbyAlmostDuplicate(nums, 2, 4));
		char c = '0';
		int i = 17;
		c = (char)(c + i);
		System.out.println( c);
	}
}
