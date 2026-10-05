class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result=new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] strLetters=strs[i].toCharArray();
            Arrays.sort(strLetters);
            String sortedStr=new String(strLetters);
            result.putIfAbsent(sortedStr, new ArrayList<>());
            result.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(result.values());
        
    }
}
