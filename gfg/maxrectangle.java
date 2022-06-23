import java.util.*;
class maxrectangle {

    public static void main (String[] args) {
		int arr[][]={{0, 1, 1, 0},
                     {1 ,1 ,1 ,1},
                     {1 ,1, 1, 1},
                     {1 ,1, 0, 0}};
        int n=arr.length;
        int m=arr[0].length;
		int maxarea=maxArea(arr,n,m);
		System.out.println(maxarea);

    }
    public static int maxArea(int M[][], int n, int m) {
        // add code here.
        
        int currow[]=M[0];
        int maxarea=maxHistogram(currow);
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(M[i][j]==1)
                {
                    currow[j]+=1;
                }
                else
                {
                    currow[j]=0;
                }
            }
            int curarea=maxHistogram(currow);
            maxarea=Math.max(maxarea,curarea);
        }
        return maxarea;
    }
    
    
    public static int maxHistogram(int a[]) 
    {
       
        
        
        int n=a.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty()&&a[s.peek()]>=a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                arr1[i]=-1;
            }
            else
            {
              arr1[i]=s.peek();  
            }
            s.push(i);
        }
      
        
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&a[st.peek()]>=a[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr2[i]=n;
            }
            else
            {
              arr2[i]=st.peek();  
            }
            st.push(i);
        }
   
    int maxarea=-999;
    for(int i=0;i<n;i++)
    {
        maxarea=Math.max(maxarea,(arr2[i]-arr1[i]-1)*a[i]);
    }
    
    
        return maxarea;
        
    }

}