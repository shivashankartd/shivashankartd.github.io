package dp;

class partionequalsum{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum =0;
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
        }
        if(sum%2!=0)
        return 0;
       
        // int w=sum/2;
        // boolean t[][]=new boolean[N+1][w+1];
        // for(int i=0;i<N+1;i++)
        // t[0][i]=false;
        // for(int j=0;j<w+1;j++)
        // t[j][0]=true;
        else
        {
            int w=sum/2;
            boolean t[][]=new boolean[N+1][w+1];
            for(int i=0;i<w+1;i++)
            t[0][i]=false;
            for(int j=0;j<N+1;j++)
            t[j][0]=true;
            for(int i=1;i<N+1;i++)
            {
                 for(int j=1;j<w+1;j++)
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
            boolean h= t[N][w];
            if(h==false)
            return 0;
            else
            return 1;
            
            
        }
        
    }
}