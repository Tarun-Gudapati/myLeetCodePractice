class Solution {
    public int[] plusOne(int[] arr) {
       
     
        
       
        
           
            for(int i=arr.length-1;i>=0;i--)
            {
               if(arr[i]<9)
               {
                arr[i]++;
                return arr;
               }
               arr[i]=0;
            }
            int [] narr=new int[arr.length+1];
            narr[0]=1;
            return narr;
           
        } 
        }
    
