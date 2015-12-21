package leetcode;

public class Maze2 {
	public boolean findNine(int[][] maze) {
		if(maze == null || maze.length == 0) return false;
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		
		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[0].length; j++) {
				if(search(maze, visited, i, j)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean search(int[][] maze, boolean[][] visited, int i, int j) {
		if(i < 0 || i >= maze.length || j < 0 || j >= maze[0].length) {
			//System.out.println("index out of bound " + "i: "+ i +" j: "+ j);
			return false;
		}
		if(maze[i][j] == 0) {
			//System.out.println("meet the wall "+ "i: "+ i +" j: "+ j);
			return false;
		}
		if(maze[i][j] == 9) {
			return true;
		}
		
		boolean exist = search(maze, visited, i+1, j) ||
						search(maze, visited, i-1, j) ||
						search(maze, visited, i, j-1) ||
						search(maze, visited, i, j+1);
		
		
		return exist;
	}
	
	public static void main(String[] args) {
		int[][] a = {
				     {1,0,0,0,0},
				     {1,1,1,1,1},
				     {1,0,0,0,0},
				     {0,0,9,0,0}
				                }; 
		int[][] b = {{1,0,0,0,0},
				     {1,1,1,1,1},
				     {1,0,0,0,1},
				     {0,0,9,1,1}};  
		int[][] c = {{1,1,1,1},
				     {1,0,0,0},
				     {1,9,0,0}};
		int[][] d = {{1,1,1,1,1,1},
					 {1,1,1,1,0,0},
					 {0,0,1,0,0,0},
					 {1,1,1,1,1,1},
					 {1,0,0,0,1,0},
					 {1,1,1,0,9,0}};  
		int[][] e = {{9}};
		Maze2 m = new Maze2();
		System.out.println(m.findNine(a));
	}
}
