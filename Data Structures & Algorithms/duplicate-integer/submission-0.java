class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numCount=new HashMap<>();
        for(int i=0; i<nums.length; i++){
                if(!numCount.containsKey(nums[i])){
                numCount.put(nums[i], 1);
            }
            else{
                numCount.put(nums[i], numCount.get(nums[i])+1);
            }
        }
        System.out.println(numCount);
        return numCount.values().stream().anyMatch(value->value>1);
        
    }
}