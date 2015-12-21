package leetcode;

import java.util.HashMap;

public class wordPattern {
    public boolean check(String pattern, String str) {
        String[] s = pattern.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        char[] c = str.toCharArray();
        if(c.length != s.length){
            return false;
        }
        map.put(c[0], s[0]);
        for(int i = 1; i < c.length; i++){
            if(!map.containsKey(c[i])){
                map.put(c[i], s[i]);
            }else{
                if(!map.get(c[i]).equals(s[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
