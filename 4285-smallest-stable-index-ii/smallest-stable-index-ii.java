class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int min=nums[nums.length-1];
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            p[i]=max;
            min = Math.min(min,nums[nums.length-1-i]);
            s[nums.length-1-i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(p[i]-s[i]<=k) return i;
        }
        return -1;
    }
}