package leetcode;
import java.util.HashMap;

public class MinWindowSubstring {
	public static String minWindow(String s, String t) {
        String res = "";
        
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        
        int left = 0;
        int minLen = s.length() + 1; //  in case that all the s is the minium string
        HashMap<Character, Integer> check = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                count++;
                if(check.containsKey(c)){
                    check.put(c, check.get(c) + 1);
                }else{
                    check.put(c, 1);
                }
            }
            
            if(count == t.length()){
                char sc = s.charAt(left);
                while(!check.containsKey(sc) || check.get(sc) > map.get(sc)) {
                    if(check.containsKey(sc) && check.get(sc) > map.get(sc)) {
                        check.put(sc, check.get(sc) - 1);
                        left++;
                        sc = s.charAt(left);
                    }
                }
            }
            
            if(i-left+1 < minLen){  // i-left + 1: length of the string that meets the requirements
                res = s.substring(left, i+1);
                System.out.println(res);
                minLen = i-left+1;
            }
        }
        
        return res;
    }
	void badSwap(int var1, int var2)
	{
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;
	}
	public static void main(String[] args){
//		String s = "ab";
//		String t = "b";
//		minWindow(s, t);
//		int[] A = {1,1,1,1,1};
//		int[] B = {2,2,2,2,2};
//		System.out.println(A);
//		A = B;
//		System.out.println(A);
//		for(int i : A){
//			System.out.println(i);
//		}
		String v1 = "TJCWO*^F(S%FKHF";
		
		System.out.println(v1.toLowerCase());
		
		
	}
}
