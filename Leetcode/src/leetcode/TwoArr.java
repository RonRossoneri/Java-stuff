package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TwoArr {
	int[] arrmatch(int[] A, int[] B){
		if(B == null || B.length == 0){
			return null;
		}
		if(A == null || A.length == 0){
			return new int[0];
		}
		int[] res = new int[B.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : A){
			if(!map.containsKey(i)){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i) + 1);
			}
		}

		HashMap<Integer, ArrayList<Integer>> pos = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < B.length; i++){
			if(pos.containsKey(B[i])){
				pos.get(B[i]).add(i);
			}else{
				pos.put(B[i], new ArrayList<Integer>());
				pos.get(B[i]).add(i);
			}
		}
		
		Set<Entry<Integer, Integer>> s = map.entrySet();
		//Iterator<Entry<Integer, Integer>> it = s.iterator();
		for( Entry<Integer, Integer> e : s){
			int value = e.getValue();
			//System.out.println(value);
			int key = e.getKey();
			if(pos.containsKey(value)){
				if(pos.get(value).size() != 0){
					int index = pos.get(value).get(0);
					res[index] = key;
					pos.get(value).remove(0);
				}
			}
		}
		
		
		for(int i = 0; i < res.length; i++){
			if(res[i] == 0){
				res[i] = -1;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] A = {1,1,1,1,2,2,2,2,3,3,3,3,7,7,7,7};
		int[] B = {4,4,6,8};
		TwoArr test = new TwoArr();
		
		int[] C = test.arrmatch(A, B);
		for(int i : C){
			System.out.println(i);
		}
	}
}
