class Solution {
    public boolean isAnagram(String s, String t) {
        //as long as string has same amount of characters and characters appear the same amount of times, anagram should be true
        HashMap<Character, Integer> characterCount=new HashMap<>();
if (s.length()==t.length()){
    char[] sArray=s.toCharArray();
    char[] tArray=t.toCharArray();
    for(int i=0; i<sArray.length; i++){
            if (!characterCount.containsKey(sArray[i])){
                characterCount.put(sArray[i], 1);
            }
            else{
                characterCount.put(sArray[i], characterCount.get(sArray[i])+1);
            }
        }
        System.out.println(characterCount);

    for(int i=0; i<tArray.length; i++){
        if(characterCount.containsKey(tArray[i]) && characterCount.get(tArray[i])>0){
            characterCount.put(tArray[i], characterCount.get(tArray[i])-1);
        }
        else{
            return false;
        }
    }
    return true;
    }
    return false;
    }
}
