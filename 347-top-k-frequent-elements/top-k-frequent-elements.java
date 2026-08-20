class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buck = new List[nums.length+1];
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n : map.keySet()){
            int freq = map.get(n);
            if(buck[freq]==null){
                buck[freq] = new ArrayList<>();
            }
            buck[freq].add(n);
        }
        int[] res = new int[k];
        int c=0;
        for(int i=buck.length-1;i>=0&&c<k;i--){
            if(buck[i]!=null){
                for(Integer y : buck[i]){
                    res[c++] = y;
                }
            }
        }
        return res;
    }
}