package leetcode;
//import java.lang.*;
import java.util.*;
public class Tester {
	List<String> Permution(String s){
		List<String> res = new ArrayList<>();
		//StringBuilder sb = new StringBuilder();
		char[] sc = s.toCharArray();
		Helper(res, sc, 0);
		return res;
	}
	
	void Helper(List<String> res, char[] sc, int i) {
		while( i < sc.length && sc[i] != '?'){
			i++;
		}
		if(i == sc.length){
			res.add(new String(sc));
			return;
		}
		sc[i] = 'K';
		Helper(res, sc, i+1);
		sc[i] = 'J';
		Helper(res, sc, i+1);
		sc[i] = '?';
//		for(char c = 'A'; c <= 'Z'; c++){
//			sc[i] = c;
//			Helper(res, sc, i+1);
//			//if (sc[i] == 'Z')
//				sc[i] = '?'; // set it back
//		}
	}
	
	public static void main(String[] args) {
//		Tester tester = new Tester();
//		List<String> print = tester.Permution("J???KJ?K");
//		System.out.println(print.size());
//		for(String s : print) {
//			System.out.println(s);
//		}
//		String s = "1241231";
//		s = s.trim();
//		System.out.println(Integer.valueOf(s));
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < 5; i++) {
			map.put(i, i);
		}
		System.out.println(map.entrySet().toString());
	}
}
