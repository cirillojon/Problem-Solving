class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        chars = {}
        for word in words:
            for char in word:
                chars[char] = chars.get(char, 0) + 1

        for _, count in chars.items():
            if count % len(words) != 0:
                return False

        return True
         