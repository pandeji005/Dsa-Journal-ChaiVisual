class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int bst=0;
        for(int n : st){
            if(!st.contains(n-1)){
                int length=1;
                while(st.contains(length+n)){
                    length++;
                }
                bst=Math.max(bst,length);
            }
        }
        return bst;
    }
}