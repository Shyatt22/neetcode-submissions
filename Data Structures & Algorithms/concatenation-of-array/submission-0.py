class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        nums_copy=nums.copy()
        new_nums=nums+nums_copy
        return new_nums
        