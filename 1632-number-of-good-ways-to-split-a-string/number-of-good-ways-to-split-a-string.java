class Solution {
    public int numSplits(String s) {
       int[] prearr = new int[s.length()];
       int[] sufarr = new int[s.length()];

       HashSet<Character> pre = new HashSet<>();
       HashSet<Character> suf = new HashSet<>();

       for(int i=0;i<s.length();i++){
            pre.add(s.charAt(i));
            suf.add(s.charAt(s.length()-1-i));

            prearr[i]=pre.size();
            sufarr[s.length()-1-i]=suf.size();
       }
       int goodSplit=0;

       for(int i=1;i<s.length();i++){
            if(prearr[i-1]==sufarr[i]) goodSplit++;
       }
       return goodSplit;
    }
}