package leetcode;

public class GOA1 {
	public int revised(int n) {
		int[] index = new int[10];

		for(int i = 0; i < 10; i++){
			index[i] = -1;
		}
		int max = 0;
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		for(int i = 0; i < sb.length(); i++){
			if(index[sb.charAt(i) - '0'] == -1){
				index[sb.charAt(i) - '0'] = i;
			}
		}
//		for(int i : index){
//			System.out.println(i);
//		}
		for(int i = 0; i < sb.length(); i++){
			int j = sb.charAt(i) - '0';
			if(index[j] != -1){
				sb.insert(i, j);
				max = Math.max(max, Integer.valueOf(sb.toString()));
				sb.deleteCharAt(i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		GOA1 test = new GOA1();
		System.out.println(19&20&5);
	}
}
