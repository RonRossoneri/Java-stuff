package leetcode;

import java.util.HashMap;

class Point {
    int x;
    int y;
    Point(int a, int b) { x = a; y = b; }
}

public class MaxPoints {
	 // 1. on the same vertical line 2. on the same horizontal line 3 the same angle to the 
	    int maxPoints(Point[] points) {
	        if(points == null || points.length == 0){
	            return 0;
	        }
	        
	        int max = 0;
	        HashMap<Double, Integer> map = new HashMap<>();
	        for(int i = 0; i < points.length; i++){
	            
	            
	            int vertical = 0;
	            int duplicate = 1; // including the point itself.
	            for(int j = i+1; j < points.length; j++){
	                double slope = 0.0;
	                if(points[i].x == points[j].x){
	                    if(points[i].y == points[j].y){
	                        duplicate++;
	                    }else{
	                        vertical++;
	                    }
	                }else{
	                    slope = points[j].y == points[i].y ? 0.0 : (1.0 * (points[j].y - points[i].y) / (points[j].x - points[i].x));
	                    
	                    if(map.get(slope) != null){
	                        map.put(slope, map.get(slope) + 1);
	                    }else{
	                        map.put(slope, 1);
	                    }
	                }                           
	            }
	            
	            for(int count : map.values()){
	                if(count + duplicate > max){
	                    max = count + duplicate;
	                }
	            }
	            System.out.println("the vertical for point " + i + " is: " + vertical);
	            System.out.println("the duplicate for point " + i + " is: " + duplicate);
	            max = Math.max(vertical + duplicate, max); // check the vertical line
	            System.out.println("loacl max for point " + i + " is: " + max);
	            map.clear();
	        }
	        
	        return max;
	    }
	    
	    public static void main(String[] args){
	    	Point[] arr = new Point[10];
	    	arr[0] = new Point(84, 250);
	    	arr[1] = new Point(0, 0);
	    	arr[2] = new Point(1, 0);
	    	arr[3] = new Point(0, 1);
	    	arr[4] = new Point(0, -70);
	    	arr[5] = new Point(0, -70);
	    	arr[6] = new Point(1, -1);
	    	arr[7] = new Point(21, 10);
	    	arr[8] = new Point(42, 90);
	    	arr[9] = new Point(-42, -230);
	    	//arr[9] = new Point(0, 1);
	    	//arr[9] = new Point(0, 1);
	    	//arr[9] = new Point(0, 1);
	    	MaxPoints mp = new MaxPoints();
	    	int j = mp.maxPoints(arr);
	    	System.out.println(j);
	    }
	}
