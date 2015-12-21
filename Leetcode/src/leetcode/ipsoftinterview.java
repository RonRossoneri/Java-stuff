package leetcode;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

public class ipsoftinterview {
	int finddistance(List<String> match, String s1, String s2){
		int res = -1;
		if(match == null || match.size() <= 1){
			return res;
		}
		ArrayList<Integer> indexs1 = new ArrayList<>();
		ArrayList<Integer> indexs2 = new ArrayList<>();
		
		for(int i = 0; i < match.size(); i++){
			if(match.get(i).equals(s1)){
				indexs1.add(i);
			}else if(match.get(i).equals(s2)){
				indexs2.add(i);
			}
		}

		for(int i : indexs1){
			for(int j : indexs2){
				res = Math.min(res, Math.abs(i-j));
			}
		}
		
		if(indexs1.size() == 0 ||indexs2.size() == 0){
			return -1;
		}
		return res;
	}
	
	public static void main(String[] args){
		ipsoftinterview test = new ipsoftinterview();
		List<String> tmp = new ArrayList<>();
		tmp.add("banana");
		tmp.add("apple");
		tmp.add("dog");
		tmp.add("banana");
		tmp.add("banana");
		tmp.add("banana");
		tmp.add("dog");
		tmp.add("banana");
		tmp.add("baby");
		int i = test.finddistance(tmp,  "cat", "dog");
		System.out.println(i);
		//System.out.println(tmp.indexOf("apple"));
	}
}
