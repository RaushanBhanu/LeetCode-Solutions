class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        nums_len = len(nums)
        removed_item=0
        i=0
        while(i<nums_len):
            if nums.count(nums[i])>2 and nums[i]!='_':
                nums.pop(i)
                nums.append('_')
                removed_item+=1
            else:
                i+=1
        return nums_len-removed_item