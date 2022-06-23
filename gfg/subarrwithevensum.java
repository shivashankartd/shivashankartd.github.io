class Solution {
    long subarrwithevensum(int[] arr, int n) {
        // code here
        int odd=0;
        int even=0;
        int sum=0;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum%2==0)
            {
                ans+=even+1;
                even++;
            }
            else
            {
                ans+=odd;
                odd++;
            }
        }
        
        return ans;
        
        
    }
}
