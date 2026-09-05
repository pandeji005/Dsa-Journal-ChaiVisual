class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] n2 = new int[nums1.length];
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            s=Math.min(s,nums1[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(s%2!=0 && nums1[i]%2==0) n2[i]=nums1[i]-s;
            else n2[i]=nums1[i];
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n2.length;i++){
            if(n2[i]%2==0) even++;
            else odd++;
        }
        if(n2.length==odd || n2.length==even) return true;

        return false;
    }
    
}