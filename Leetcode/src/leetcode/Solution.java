package leetcode;

import java.util.Stack;

class Solution {
    public int solution(String S) {
        Stack<String> stack = new Stack<>();
        String[] dirs = S.split("\n");
        
        int len = 0;
        int res = 0;
        int Space = 0;
        for(int i = 0; i < dirs.length; i++){
            if(isPic(dirs[i])){
                String cur = dirs[i].trim(); 
                len += cur.length() + 1;
                res = res > len ? res : len;
                len -= cur.length() + 1;
            }else{
                int count = 0;
                while(dirs[i].charAt(count) == ' '){
                    count++;                
                }
                while(count < Space && !stack.isEmpty()){
                    Space--;
                    len -= stack.peek().trim().length() + 1;
                    stack.pop();
                }
                
                stack.push(dirs[i]);
                len += dirs[i].trim().length() + 1;
                Space++;
            }  
        }
        return res;
    }
    
    boolean isPic(String p){
        p = p.trim();
        String[] pic = p.split("\\.");
        if(pic.length < 2){
            return false;
        }
        if(pic[1].equals("jpeg") || pic[1].equals("png") || pic[1].equals("gif")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		
	}
}
