package leetcode;

class Box{
	char col;
	Box(char c){
		this.col = c;
	}
	Box(){
		
	}
}

//public class sortColor {
//	Box[] sort(Box[] color){
//		if(color.length == 0 || color == null){
//			return null;
//		}
//		int i = 0; 
//		int l = 0; 
//		int r = color.length - 1;
//		while(i <= r){
//			if(color[r].col == 'r'){
//				swap(color, r, i);
//				i++;
//			}else{
//				r--;
//			}
//		}
//		i = 0;
//		while(color[i].val == 0){
//			i++;
//		}
//		l = i;
//		r = color.length - 1;
//		while(i <= r){
//			if(color[i].val == 1){
//				swap(color, l, i);
//				l++;
//				i++;
//			}else if(color[i].val == 2){
//				i++;
//			}else{
//				swap(color, i, r);
//				r--;
//			}
//		}
//		
//		return color;
//	}
public class sortColor {
	 void sort(Box[] color){
		if(color.length == 0 || color == null) {
			return;
		}
		int [] count = new int[3];
		for(Box b : color){
			if(b.col == 'r'){
				count[0]++;
			}else if(b.col == 'g'){
				count[1]++;
			}else{
				count[2]++;
			}
		}
//		for(int i = 0; i < color.length; i++){
//			if(i < count[0]){
//				color[i].col = 'r';
//			}else if(i >= count[0] && i < count[0] + count[1]){
//				color[i].col = 'g';
//			}else{
//				color[i].col = 'b';
//			}
//		}
		int l = 0; 
		int r = color.length - 1;
		int i = 0;
		while(i <= r){
			if(color[i].col == 'b'){
				swap(color, i, r);
				r--;
			}else if(color[i].col == 'r'){
				swap(color, l, i);
				l++;
				i++;
			}else{
				i++;
			}
		}
		
		return;
	}
	
	void swap(Box[] color, int i, int j){
		Box tmp = color[i];
		color[i] = color[j];
		color[j] = tmp;
	}
	
	
	public static void main(String[] args){
		Box p1 = new Box('r');
		Box p2 = new Box('b');	
		Box p3 = new Box('g');
		Box p4 = new Box('g');
		Box p5 = new Box('b');
		Box p6 = new Box('r');
		Box p7 = new Box('r');
		Box p8 = new Box('g');
		Box p9 = new Box('b');
		Box p10 = new Box('b');
		Box p11 = new Box('b');
		//Box p = new Box('p');
		//Box[] color1 = {r,g,b,r,b,g,r,b,b,g,b,g,b,p,p,p,p,r,r,g,g,b,b,g,r,p};
		
		Box[] color = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
		
		for(Box s : color){
			System.out.print(s.col + " ");
		}
		System.out.println();
		sortColor sc = new sortColor();
		sc.sort(color);
		for(Box s : color){
			System.out.print(s.col + " ");
		}
	}
}
