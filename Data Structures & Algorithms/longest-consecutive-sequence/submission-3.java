class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        TreeSet<Integer> ts= new TreeSet<>();
        for(int num:nums)
        {
            ts.add(num);
        }
        int longest=1;
        int current=1;
        Integer prev=null;
        for(int check:ts)
        {
            if(prev!=null && check==prev+1)
            {
                current++;
            }
            else
            {
                current=1;
            }
            longest=Math.max(longest,current);
            prev=check;
        }
        return longest;
    }
}
