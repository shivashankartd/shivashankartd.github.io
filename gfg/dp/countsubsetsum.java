package dp;

class Solution {
    int countsubsetsum(int[] arr, int N, int sum) {
        // code here
        
        int i ,j;
        int t[][]=new int[N+1][sum+1];
        for(i=0;i<sum+1;i++)
            t[0][i]=0;
        for(i=0;i<N+1;i++)
            t[i][0]=1;
            
           
        
         for(i=1;i<N+1;i++)
        {
            for(j=1;j<sum+1;j++)
            {
                 if(arr[i-1]<=j)
                {
            
                     t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                }
                else
                {
                    t[i][j]= t[i-1][j];
                }
            }
        }    
        
    
        return t[ N][sum];
    }
}
