class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                hash.remove(nums[i-k-1]);
            }
            if(!hash.add(nums[i])) return true;
        }
        return false;
    }
}