class Solution {
    public boolean uniformArray(int[] nums1) {
        int s = Integer.MAX_VALUE;
        for(int x : nums1){
            if(x%2==1) s=Math.min(s,x);
        }
        if(s==Integer.MAX_VALUE) return true;
        for(int x : nums1){
            if(x%2==0 && x<=s) return false;
        }
        return true;
    }
}