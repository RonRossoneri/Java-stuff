package leetcode;

import java.util.Stack;

public class SimpifyPath {
	public static String simplifyPath(String path) {
        String[] check = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String sss : check) {
        	System.out.print(sss + ", ");
        	System.out.println();
        }
        for(String s : check){
            if(s.equals("") || s.equals(".")){
                continue;
            }else if(s.equals("..")){
            	if(!stack.isEmpty()){
	            	System.out.println(stack.peek());
	                stack.pop();
	                System.out.println("hey");
            	}
            }else{
                stack.push(s);
                System.out.println(stack.peek());
                System.out.println("h");
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
        	System.out.println("haha");
            res.insert(0, stack.pop());
            res.insert(0, "/");
        }
        return res.length() == 0 ? "/" : res.toString();
    }
    public static void main(String[] args){
    	simplifyPath("/////////..");
    }
}

