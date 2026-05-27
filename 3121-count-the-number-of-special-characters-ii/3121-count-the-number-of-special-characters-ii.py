class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        indices = {}
        res_set = set()
        for i, c in enumerate(word, 0):
            if c in indices.keys() and c.isupper():
                continue
            else:
                indices[c] = i
        for k in indices.keys():
            if k.upper() in indices.keys() and k.lower() in indices.keys():
                if indices[k.lower()] < indices[k.upper()]:
                    res_set.add(k.lower())
        return len(res_set)