class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=1;
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    arr[i]=arr[i]*nums[j];
                }
            }
            
        }
        return arr;
    }
}  
