class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        
        return GCD(small,large);
        
    }
    public int GCD(int small,int large){
        if(large==0) return small;
        
        return GCD(large,small%large);

    }
}
    
