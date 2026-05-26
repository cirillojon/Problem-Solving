class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        return len(set(word)) - len(set(word.lower()))