class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int n : nums1){
            if(!set.contains(n)) set.add(n);
        }
        for(int n : nums2){
            if(set.contains(n)){
                res.add(n);
                set.remove(n);
            }
        }
        int[] o = new int[res.size()];
        int i=0;
        for(int n : res){
            o[i++]=n;
        }
        return o;
        
    }
}