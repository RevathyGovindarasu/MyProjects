package Leetcode;

public class Island {
	    public int numIslands(char[][] grid) {
	        if(grid==null || grid.length==0||grid[0].length==0)
	        return 0;
	 
	    int m = grid.length;
	    int n = grid[0].length;
	 
	    int count=0;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(grid[i][j]=='1'){
	                count++;
	                System.out.println("before calling merge");
	        	    for(int row=0;row<i;row++)
	        	    {
	        	    	System.out.println();
	        	    	for(int col=0;col<j;col++)
	        	    	{
	        	    		System.out.print(grid[i][j]+", ");
	        	    	}
	        	    	
	        	    }
	        	    System.out.print("]");
	        	    
	                merge(grid, i, j);
	            }
	        }
	    }
	 
	    return count; 
	    }
	    
	    
	    public void merge(char[][] grid, int i, int j)
	    {
	    int m=grid.length;
	    int n=grid[0].length;
	 
	    if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')
	        return;
	 
	    grid[i][j]='X';
	    System.out.println();
	    System.out.println("before grid merge.. ");
	    System.out.print("[");
	    for(int row=0;row<i;row++)
	    {
	    	System.out.println();
	    	for(int col=0;col<j;col++)
	    	{
	    		System.out.print(grid[i][j]+", ");
	    	}
	    	
	    }
	    System.out.print("]");
	    
	 
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	    System.out.println();
	    System.out.println("after grid merge.. ");
	    System.out.print("[");
	    for(int row=0;row<i;row++)
	    {
	    	System.out.println();
	    	for(int col=0;col<j;col++)
	    	{
	    		System.out.print(grid[i][j]+", ");
	    	}
	    	
	    }
	    System.out.print("]");
	    }
	
	public static void main(String[] args) 
	{
		
		 char M[][] = new char[][] { { '1', '1', '0', '0', '0' }, 
             { '0', '1', '0', '0', '1' }, 
             { '1', '0', '0', '1', '1' }, 
             { '0', '0', '0', '0', '0' }, 
             { '1', '0', '1', '0', '1' } }; 
             Island I = new Island(); 
             System.out.println("Number of islands is: " + I.numIslands(M)); 

	}

   

} 

