class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String check:strs)
        {
            char[] ch=check.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);

            hm.putIfAbsent(s1,new ArrayList<>());
            hm.get(s1).add(check);
        }
        return new ArrayList<>(hm.values());
    }
}
