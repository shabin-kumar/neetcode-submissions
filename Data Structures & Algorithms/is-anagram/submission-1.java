class Solution {
    public boolean isAnagram(String s, String t) {
    int len_s=s.length();
    int len_t=t.length();
    int[] arr=new int[26];
    if(len_s!=len_t)
    {
        return false;
    }
    for(int i=0;i<len_s;i++)
    {
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
    }
    
    for(int nums:arr)
    {
        if(nums!=0)
        return false;
    }
    return true;
    }
}