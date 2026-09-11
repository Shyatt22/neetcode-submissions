class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Initialize hashmap
        HashMap<Integer, Integer> sums=new HashMap<>();
        //loop through nums to see which numbers add up to target
        for (int i=0; i<nums.length; i++){
            int difference=target-nums[i];
            if(sums.containsKey(difference)){
                int[] indices={sums.get(difference), i};
                return indices;
            }
            //add to hashmap
            sums.put(nums[i], i);
        }

        return null;
    }
}
