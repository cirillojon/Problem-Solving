class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        indices = {}
        res_set = set()
        for i, c in enumerate(word, 0):
            if c in indices.keys() and c.isupper():
                continue
            else:
                indices[c] = i
        for w in word:
            if w.upper() in indices.keys() and w.lower() in indices.keys():
                if indices[w.lower()] < indices[w.upper()]:
                    res_set.add(w.lower())
        return len(res_set)