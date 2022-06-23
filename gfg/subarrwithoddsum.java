class Solution {
    long countEvenSum(int[] arr, int n) {
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
                ans+=odd;
                even++;
            }
            else
            {
                ans+=even+1;
                odd++;
            }
        }
        
        return ans;
        
        
    }
}
