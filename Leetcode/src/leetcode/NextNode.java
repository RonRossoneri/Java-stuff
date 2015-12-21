package leetcode;


class NextNode {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		TreeNode(int val){
			this.val = val;
		}
		
	}
	TreeNode NextBigger(TreeNode node){
		if(node == null){
			return null;
		}
		//分的情况，1， node 有右节点--》好办了
		//2.node 没有右节点，只能从parent节点入手，1》node是p的左节点（那就是p了）2》node是p的右节点（继续判断，找到一个是左节点的p）
		if(node.right != null){
			node = node.right;
			while(node.left != null){
				node = node.left;
			}
			return node;
		}else{
			if(node.parent != null){
				TreeNode p = node.parent;
				if(p.left == node){
					return p;
				}else{
					while(p != null && p.right == node){
						node = p;
						p = p.parent;
					}
					return p;
				}
			}
		}
		return null;
	}
	
	public TreeNode nextSmaller(TreeNode node){
		if(node.left != null){
			node = node.left;
			while(node.right != null){
				node = node.right;
			}
			return node;
		}
		TreeNode p = node.parent;
		while(p.parent != null && node == p.left){
			node = p;
			p = p.left;
		}
		return p;
	}
	
	TreeNode NextWHp(TreeNode root, TreeNode node){ 
		
		/*如果是没有parent节点，我们只能从头往下找，有右节点的不变
		没有右节点，只能从根往下找，看根比node大--根左移，跟比node小--根右移
		*/
		
		
		
		if(node == null){
			return null;
		}
		if(node.right != null){
			node = node.right;
			while(node.left != null){
				node = node.left;
			}
			return node;
		}else{
			TreeNode succ = null;
			while(root != null){
				if(root.val > node.val){
					root = root.left;
				}else if (root.val < node.val){
					root = root.right;
				}else{
					break;
				}
			}
			return succ;
		}
	}
	public static void main(String[] args) {
		int i = 0^0^1^2^3^4^5;
		int j = 0^0^1^2^3^4;
		
		System.out.println(i^j);
		
	}

}
