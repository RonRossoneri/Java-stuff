package leetcode;
//
//OOD: design a virtual zoo system
//a) write a enum type
//b) hierachy is   
//					  animal
//                /     |     \
//      reptiles     mammal        bird (can fly)
//                     |                     
//                   bat (can fly)
// c) design animal, mammal, bird as abstract class and design Fly as interface

import java.util.*;

public class OOD_zoo {
	
}

enum Habitat{
	LAND(1), SKY(2), SEA(3);
	private int value;
	private Habitat(int i) {
		value = i;
	}
}

abstract class Animal{
	String name;
	String species;
	Habitat home;
	Animal(String name, String species, Habitat home){
		this.name = name;
		this.species = species;
		this.home = home;
	}
	public String getName() {
		return name;
	}
	
	abstract void eat();
	abstract void sleep();
}

abstract class Mannal extends Animal{
	static String subspecies;
	Mannal(String name, String species, String subspecies, Habitat home) {
		super(name, species, home);
		this.subspecies = subspecies;
	}
	
	abstract void buru();
}

abstract class Bird extends Animal{
	static String birdtype;
	Bird(String name, String species, Habitat home, String birdtype) {
		super(name, species, home);
		this.birdtype = birdtype;
		// TODO Auto-generated constructor stub
	}
	
}

class Bat extends Mannal implements Fly {

	Bat(String name, String species, String subspecies, Habitat home) {
		super(name, species, subspecies, home);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tookoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buru() {
		
	}
}

interface Fly{
	public void tookoff();
	public void landing();
}
interface cage{
	int cage = 1;
	int zone = 2;
}

//public class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int val) {
//		this.val = val;
//	}
//}
//
//
//public class Solution{
//	public TreeNode MirrorBST(TreeNode root) {
//		if(root == null) {
//			return root;
//		}
//		Queue<TreeNode> que = new LinkedList<>();
//		que.offer(root);
//		while(!que.isEmpty()) {
//			TreeNode tmp = que.poll();
//			TreeNode tmpright = null, tmpleft = null;
//				if(tmp.left != null) {
//					que.offer(tmp.left);
//					tmpleft = tmp.left;
//				}
//				if(tmp.right != null) {
//					que.offer(tmp.right);
//					tmpright = tmp.right;
//				}
//				tmp.left = tmpright;
//				tmp.right = tmpleft;
//			}
//		}
//		return root;
//	}
//}
