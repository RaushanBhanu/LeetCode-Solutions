class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        length=len(nums)
        nlength=length-k
        for i in range(length,nlength,-1):
            temp=nums.pop()
            nums.insert(0,temp)