package dp;

class perfectsum{

	public int perfectSum(int arr[],int N, int sum) 
	{ 
	    // Your code goes here
	     int i ,j;
        int t[][]=new int[N+1][sum+1];
        for(i=0;i<sum+1;i++)
            t[0][i]=0;
        // for(i=0;i<N+1;i++)
        //     t[i][0]=1;
        
        //in constraint even 0 is included so above line is commented and for loop starts from j=0
        t[0][0]=1;
            
           
        
         for(i=1;i<N+1;i++)
        {
            for(j=0;j<sum+1;j++)
            {
                 if(arr[i-1]<=j)
                {
            
                     t[i][j]=(t[i-1][j-arr[i-1]]+t[i-1][j])%1000000007;
                }
                else
                {
                    t[i][j]= t[i-1][j]%1000000007;
                }
            }
        }    
        
    
        return t[ N][sum];
	} 
}