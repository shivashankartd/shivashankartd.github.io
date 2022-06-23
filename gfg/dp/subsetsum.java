package dp;

class subsetsum{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int i ,j;
        boolean t[][]=new boolean[N+1][sum+1];
        for(i=0;i<sum+1;i++)
            t[0][i]=false;
        for(i=0;i<N+1;i++)
            t[i][0]=true;
            
           
        
         for(i=1;i<N+1;i++)
        {
            for(j=1;j<sum+1;j++)
            {
                 if(arr[i-1]<=j)
                {
            
                     t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
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
