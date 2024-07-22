class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer ,Integer> hm=new HashMap<>();
      int [] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            if(!hm.containsKey(x))
            {
                hm.put(target-x,i);
            }
            else
            {
                arr[0]=i;
                arr[1]=hm.get(x);
            }

           
    }return arr;
}} 
