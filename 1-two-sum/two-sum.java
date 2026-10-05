class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int left = target-nums[i];
            if(hash.containsKey(left)){
                return new int[] {hash.get(left),i};
            }
            hash.put(nums[i],i);
        }
        return new int[] {};
    }
}