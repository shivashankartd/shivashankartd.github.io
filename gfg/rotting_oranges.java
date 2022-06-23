import java.util.*;
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int rotting_oranges(int[][] grid)
    {
        int count=0;
      int r = grid.length;
        int c = grid[0].length;
        // int time = 0;
        int freshCount=0;
        Queue<solution> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    // System.out.println(i);
                    // System.out.println(j);
                    // solution<Integer, Integer> p = new solution<>(i,j);  
                    q.add(new solution(i,j));
                }
                if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        
        
        if(freshCount==0){
            return 0;
        }
        q.add(new solution(-1,-1));
        //  solution<Integer, Integer> p = new solution<>(-1,-1);        
        
        while(!q.isEmpty())
        {
            solution temp=q.poll();
            // int currTime=temp.time;
            int x=temp.x;
            int y=temp.y;
            // System.out.println(x);
            // System.out.println(y);
            
            
            if(x==-1 && y==-1 &&q.size()==1)
            {
                q.poll();
                break;
            }
            else if(x==-1 && y==-1 && q.size()>1)
            {
                count++;
                q.poll();
                q.add(new solution(-1,-1));
            }
            else
            {
                if((y+1)<c && grid[x][y+1]==1)
                {
                    grid[x][y+1]=2;
                    q.add(new solution(x,y+1));
                    
                }
                if((y-1)>=0 && grid[x][y-1]==1)
                {
                    grid[x][y-1]=2;
                    q.add(new solution(x,y-1));
                    
                }
                if((x+1)<r && grid[x+1][y]==1)
                {
                    grid[x+1][y]=2;
                    q.add(new solution(x+1,y));
                    
                }
                if((x-1)>=0 && grid[x-1][y]==1)
                {
                    grid[x-1][y]=2;
                    q.add(new solution(x-1,y));
                    
                }
            
                 q.poll();
            }
        }
        // System.out.println(count);
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
                    
        return count;
    }
}
class solution
{
    // int time;
    int x,y;
    solution(int x,int y){
        // time=t;
        this.x=x;
        this.y=y;
    }
    
}    