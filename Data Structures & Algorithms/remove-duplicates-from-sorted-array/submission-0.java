class Solution {
    public int removeDuplicates(int[] nums) {
        int writeIndex=1;
        
        for (int i=1; i<nums.length; i++){
           if(nums[i]!=nums[i-1]){
            nums[writeIndex]=nums[i];
            writeIndex++;
           }
        }

        return writeIndex;
    }
}