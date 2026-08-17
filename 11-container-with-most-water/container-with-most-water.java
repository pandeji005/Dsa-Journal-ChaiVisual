class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int area = 0;
            if(height[l]<height[r]){
                area = (r-l) * height[l];
                l++;
            }
            else{
                area = (r-l) * height[r];
                r--;
            }
            

            if(area>max) max = area;
            
        }
        return max;
    }
}