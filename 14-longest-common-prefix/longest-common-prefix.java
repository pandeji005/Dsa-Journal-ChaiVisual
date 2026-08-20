class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null) return "";
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);
        char[] ch1 = strs[0].toCharArray();
        char[] ch2 = strs[strs.length-1].toCharArray();

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]) break;
            sb.append(ch1[i]);
        }
        return sb.toString();
        
    }
}