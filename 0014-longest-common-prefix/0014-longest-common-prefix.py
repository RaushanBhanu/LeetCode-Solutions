class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        common_prefix=""
        for i in range(len(strs[0])):
            total=0
            k=i
            for j in range(1,len(strs)):
               if len(strs[j])>i and strs[0][k]==strs[j][k]:
                    total+=1
            if total==len(strs)-1:
                common_prefix+=strs[0][k]
            else:
                break
        return common_prefix