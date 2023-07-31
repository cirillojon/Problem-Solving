class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        
        r_chars = {}
        m_chars = {}
        
        for c in ransomNote:
            r_chars[c] = r_chars.get(c, 0) + 1
        for c in magazine:
            m_chars[c] = m_chars.get(c, 0) + 1
        for c in ransomNote:
            if c in r_chars and c not in m_chars:
                return False
            if r_chars[c] <= m_chars[c]:
                continue
            else:
                return False
        
        return True