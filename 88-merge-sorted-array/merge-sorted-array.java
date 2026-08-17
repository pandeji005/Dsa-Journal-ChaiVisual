class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=1;
        for(int i=0;i<n;i++){

            nums1[m+j-1] = nums2[i];
            j++;

        }
        Arrays.sort(nums1);

        
    }
}