class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hash = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String x = new String(ch); //sorted string Ex : aet; 
            //each sorted string has a list associated with unsorted string;
            if(!hash.containsKey(x)) hash.put(x,new ArrayList<>());
            hash.get(x).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}