
import java.util.*;
class largestareahistogram
{
    //Function to find largest rectangular area possible in a given histogram.
    public static void main (String[] args) {
		int arr[]={6,2,5,4,5,1,6};
        long N=arr.length;
		long maxarea=getMaxArea(arr,N);
		System.out.println(maxarea);
	}

    public static long getMaxArea(int a[], long N) 
    {
        // your code here
        // long max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     int l=i,r=i;
        //     while(l>=0)
        //     {
        //         if(a[l]>=a[i])
        //         {
        //             l--;
        //         }
        //         else                                       /////time limit excced
        //         {
        //             break;
        //         }
        //     }  
        //     while(r<n)
        //     {
        //         if(a[r]>=a[i])
        //         {
        //             r++;
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }    
        //     max=Math.max(max,(Math.abs(r-l)-1)*a[i]);
        // }
        // return max;
        
        
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
        // for(int i=0;i<n;i++)
        // {
        // System.out.print(arr1[i]+" ");}
        
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
    //   for(int i=0;i<n;i++)
    //     {
    //     System.out.print(arr2[i]+" ");}
    long maxarea=-999;
    for(int i=0;i<n;i++)
    {
        maxarea=Math.max(maxarea,(arr2[i]-arr1[i]-1)*a[i]);
    }
    
    
        return maxarea;
        
    }
        
}

