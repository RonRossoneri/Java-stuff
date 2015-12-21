package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode{
	char value;
	TreeNode left;
	TreeNode right;
	TreeNode(char c){
		this.value = c;
	}
}
public class TernaryToBinary {
	TreeNode TtoB(String s){
		if(s == null || s.length() == 0){
			return null;
		}
		char[] sc = s.trim().toCharArray();
		TreeNode node = new TreeNode(sc[0]);
		TreeNode start = node;
		Stack<TreeNode> stack = new Stack<>();
		
		for(int i = 1; i < sc.length; i += 2){
			if(sc[i] == '?'){
				node.left = new TreeNode(sc[i+1]);
				System.out.println(sc[i+1]);
				stack.push(node); //  push the parent node of current node !!!
				node = node.left;
			}else if(sc[i] == ':'){
				node = stack.pop();
//				while(node.right != null){
//					node = stack.pop();
//				}
				node.right = new TreeNode(sc[i+1]);
				System.out.println(sc[i+1]);
				//stack.push(node);
				node = node.right;
			}
		}
		return start;
	}
	
	public static void main(String[] args) {
		String s = "a?b?c:d?e:f:g";
		TernaryToBinary test = new TernaryToBinary();
		TreeNode result = test.TtoB(s);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(result);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode now = queue.poll();
				System.out.print(now.value);
				if (now.left != null) {
					queue.offer(now.left);
				} else {
					System.out.print("(no left) ");
				}
				
				if (now.right != null) {
					queue.offer(now.right);
				} else {
					System.out.print("(no right) ");
				}
				
			}
			
			System.out.println();
		}
	}
}


