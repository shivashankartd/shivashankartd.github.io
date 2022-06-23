package dp;
import java.util.*;
class minimumsumpartition
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    
	    int sum=Arrays.stream(arr).sum();
	    boolean dp[][]=new boolean[n+1][(sum/2)+1];
	    
	    for(int i=0;i<(sum/2)+1;i++)
	    {
	        dp[0][i]=false;
	    }
	    for(int i=0;i<n+1;i++)
	    {
	        dp[i][0]=true;
	    }
	    
	    
	    for(int i=1;i<n+1;i++)
	    {
	        for(int j=1;j<(sum/2)+1;j++)
	        {
	            if(arr[i-1]<=j)
	            {
	                dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
	            }
	            else
	            {
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    int f=0;
	    for(int i=sum/2;i>=0;i--)
	    {
	        if(dp[n][i]==true)
	        {
	            f=i;
	            break;
	        }
	    }
	    return sum-2*f;
	} 
}