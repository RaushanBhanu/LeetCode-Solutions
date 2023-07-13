class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        index=0
        if needle in haystack:
            index=haystack.index(needle)
            return index
        return -1