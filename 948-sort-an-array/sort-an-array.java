class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
        
    }
    public void mergeSort(int[] nums , int start , int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);

            merge(nums,start,mid,end);
        }
    }
    public void merge(int[] nums , int start , int mid , int end){
        int[] n1 = new int[mid-start+1];
        int[] n2 = new int[end-mid];
        for(int i=0;i<n1.length;i++){
            n1[i]=nums[start+i];
        }
        for(int i=0;i<n2.length;i++){
            n2[i]=nums[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1.length && j<n2.length){
            if(n1[i]<=n2[j]){
                nums[k]=n1[i];
                i++;
            }else{
                nums[k]=n2[j];
                j++;
            }
            k++;
        }
        while(i<n1.length){
            nums[k]=n1[i];
            i++;
            k++;
        }
        while(j<n2.length){
            nums[k]=n2[j];
            j++;
            k++;
        }
    }
}