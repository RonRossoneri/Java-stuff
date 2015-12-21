package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFreq {
	List<Integer> topK(int[] nums, int k){
		List<Integer> res = new ArrayList<>();
		if(nums == null || nums.length == 0){
			return res;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else{
				map.put(i, 1);
			}
		}
		if(k > map.size()){
			System.out.println("Invalid K input, check again!");
			return res;
		}
		Set<Map.Entry<Integer, Integer>> set  =  map.entrySet();
		
		Comparator<Map.Entry<Integer, Integer>> cmp = new Comparator<Map.Entry<Integer, Integer>>(){
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e2.getValue() - e1.getValue();
			}
		};
		PriorityQueue<Map.Entry<Integer, Integer>> Pque = new PriorityQueue<Map.Entry<Integer, Integer>>(k, cmp);
		for(Map.Entry<Integer, Integer> entry : set){
			Pque.add(entry);
			System.out.println("Add entry with Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		while(k>0){
			res.add(Pque.poll().getKey());
			k--;
		}
		return res;
	}
	
	public static void main(String[] args) {
		TopKFreq test = new TopKFreq();
		int[] a = {1,1,1,1,2,2,2,2,3,4,4,2,5,6,6,1,5,4,7,7,4,32,5,6,8,7,6,54,3,2,4,5,7,8,3,1};
		List<Integer> show = test.topK(a, 7);
		for(int i : show){
			System.out.println(i);
		}
	}
}
