package leetcode;

public class ArraySum {
	int sum(int[] arr, int index){
		if(index == arr.length - 1){
			return arr[index];
		}
		return arr[index]+sum(arr, index+1);
	}
	
	int MinSpace(int[] arr1, int[] arr2){
		int i = 0;
		int j = 0;
		int res = Integer.MAX_VALUE;
		while(i < arr1.length - 1 && j < arr2.length - 1){
			while(arr1[i] < arr2[j] && i < arr1.length - 1){
				i++;
				res = Math.min(res, Math.abs(arr1[i] - arr2[j])); 
			}

			while(arr1[i] > arr2[j] && j < arr2.length - 1){
				j++;
				res = Math.min(res, Math.abs(arr1[i] - arr2[j]));
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		ArraySum test = new ArraySum();
		int[] arr1 = {1, 15};
	    int[] arr2 = {3, 4, 6, 9, 13, 14};
	    int ans = test.MinSpace(arr1, arr2);
		System.out.println(ans);
	}
}
