package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IPsoft_remove {
	
	List<Integer> remove (List<Integer> list){
		
//		Iterator<Integer> iter = list.iterator();
//		while(iter.hasNext()){
//			int j = iter.next();
//			if(j % 7 == 0){
//				iter.remove();
//			}
//		}
//		return list;
		int n = list.size();
		for(int i = 0; i < n ; i++){
			if(list.get(i) % 7 == 0){
				list.remove(i);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args){
		IPsoft_remove test = new IPsoft_remove();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 50; i++){
			list.add(i);
		}
		System.out.println(list.hashCode());
		for(int i : test.remove(list)){
			System.out.println("The number is " + i);
		}
	}
}
