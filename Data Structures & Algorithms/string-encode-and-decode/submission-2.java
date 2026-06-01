class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String st:strs)
        {
            sb.append(st.length()).append("#").append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int len=str.length();
        int i=0;
        while(len>i)
        {
            int j=i;
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int og_len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+og_len);
            result.add(word);
            i=j+1+og_len;
        }
        return result;
    }
}
