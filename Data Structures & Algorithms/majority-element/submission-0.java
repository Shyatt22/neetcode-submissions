class Solution {
    public int majorityElement(int[] nums) {
        int avgNumsCount=nums.length/2;

        HashMap<Integer, Integer> numsCount=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!numsCount.containsKey(nums[i])){
                numsCount.put(nums[i], 1);
            }
            else{
                numsCount.put(nums[i], numsCount.get(nums[i])+1);
            }
        }
        
        int result=0;
        for(int i=0; i<nums.length; i++){
            if(numsCount.get(nums[i])>avgNumsCount){
                result=nums[i];
            }

        }
        return result;
    }
}