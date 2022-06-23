// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.*;
class subarrwithequal_even_and_odd_integers{
    public static void main(String args[] ) throws Exception {
        

         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // if(n==0 ||n==1)
        // {
        //     System.out.print("0");
        // }
        sc.close();  
        int c=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                sum+=-1;
            }
            else
            {
                sum+=1;
            }
            
            if(m.containsKey(sum))
            {
                c+=m.get(sum);
            }
            
            m.put(sum,m.getOrDefault(sum,0)+1);
            
        }
       System.out.print(c); 
    }
}

