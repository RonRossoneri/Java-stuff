package leetcode;

public class SumUp {
	String sumup(char[] A){
		int index = 0;
		
		for(int i = 0; i < A.length; i++){
			int count = 1;
			while(i+1 < A.length && A[i] == A[i+1]){
				i++;
				count++;
			}
			if(count > 1){			
				A[index++] =(char)(count + 48);
			}
			A[index++] = A[i];
			if(i + 1 == A.length){
				for(int j = index; j < A.length; j++){
					A[j] = ' ';
				}
			}
		}
		return new String(A);
	}
	
	public static void main(String[] args) {
		SumUp test = new SumUp();
		char[] A = {'A','C', 'C', 'C', 'C', 'D', 'D', 'D', 'E', 'E', 'E', 'E', 'E'};
		char[] B = {};
		System.out.println(test.sumup(A));
//		char c = '9';
//		char d = '8';
//		int i = Character.digit(c, 10) + Character.digit(d, 10);
//		System.out.println(i);
	}
}
