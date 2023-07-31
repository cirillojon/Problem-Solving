class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        
        for c in ransomNote:
            if ransomNote.count(c) <= magazine.count(c):
                continue
            else:
                return False
        
        return True