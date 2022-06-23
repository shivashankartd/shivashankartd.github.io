class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void matrixanticlock90(int mat[][], int n) 
    { 
        // code here
        for(int i=0;i<n;i++)
        {
            int l=0;
            int h=n-1;
            while(l<h)
            {
                int temp=mat[i][l];
                mat[i][l]=mat[i][h];            ////reverse
                mat[i][h]=temp;
                
                l++;
                h--;
            }
            
            
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];                //////transpose
                mat[j][i]=temp;
            }
        }
    }
}