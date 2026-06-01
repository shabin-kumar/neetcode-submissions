class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int num:nums)
       {
        if(hm.containsKey(num))
        {
            hm.put(num,hm.get(num)+1);
        }
        else
       {
        hm.put(num,1);
       }
       }
       
       int[] arr=new int[k];
       for(int i=0;i<k;i++)
       {
        int maxnum=0;
        int maxfreq=0;
        for(int key:hm.keySet())
        {
            if(hm.get(key) > maxfreq)
            {
                maxfreq = hm.get(key);
                maxnum = key;
            }
        }
        arr[i]=maxnum;
        hm.remove(maxnum);
       }
        return arr;
    }
    
}
