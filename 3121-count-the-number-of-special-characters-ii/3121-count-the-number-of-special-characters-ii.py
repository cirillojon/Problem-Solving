class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        first_indices = {}
        res_set = set()
        for i, c in enumerate(word, 0):
            if c in first_indices.keys() and c.isupper():
                continue
            else:
                first_indices[c] = i

        for w in word:
            if w.upper() in first_indices.keys() and w.lower() in first_indices.keys():
                if first_indices[w.lower()] < first_indices[w.upper()]:
                    res_set.add(w.lower())
        return len(res_set)