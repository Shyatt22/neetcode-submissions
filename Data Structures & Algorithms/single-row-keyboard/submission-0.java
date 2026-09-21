class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> keys= new HashMap<>();
        char[] keysArray=keyboard.toCharArray();
        char[] wordArray=word.toCharArray();
        for(int i=0; i<keysArray.length; i++){
            keys.put(keysArray[i], i);
        }

        int total=0;
        int prev=0;
        for (int i=0; i<wordArray.length; i++){
            int letterIndex=keys.get(wordArray[i]);
            total+=Math.abs(letterIndex - prev);
            prev=letterIndex;
        }
        return total;
        
    }
}
