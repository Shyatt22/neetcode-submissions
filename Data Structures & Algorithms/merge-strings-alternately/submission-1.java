class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int longestWord=Math.max(word1.length(), word2.length());
        int shortestWord=Math.min(word1.length(), word2.length());
        StringBuilder result=new StringBuilder(longestWord);
        char[] word1Array=word1.toCharArray();
        char[] word2Array=word2.toCharArray();

        while(i<word1.length()||i<word2.length()){
            if(i<word1.length()){
                result.append(word1Array[i]);
            }
            if(i<word2.length()){
                result.append(word2Array[i]);
            }
            
            i++;
        }
        System.out.println(result);
        return result.toString();
        
    }
}