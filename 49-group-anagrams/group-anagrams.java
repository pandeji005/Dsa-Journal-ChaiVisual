class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> hash = new HashMap<>();
        for(String x : strs){
            char[] ch = x.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);
            if(!hash.containsKey(s1)) hash.put(s1,new ArrayList<>());
            hash.get(s1).add(x);
        }
        return new ArrayList<>(hash.values());
    }
}