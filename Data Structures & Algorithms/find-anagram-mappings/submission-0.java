class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums2Indices=new HashMap<>();
        for (int i=0; i<nums2.length; i++){
            nums2Indices.put(nums2[i], i);
        }

        int[] result=new int[nums1.length];
        for (int i=0; i<nums1.length; i++){
            result[i]=nums2Indices.get(nums1[i]);
        }
        
        return result;
    }
}
