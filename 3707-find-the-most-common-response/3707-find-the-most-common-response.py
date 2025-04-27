class Solution:
    def findCommonResponse(self, responses: List[List[str]]) -> str:
        freq = {}

        # Remove duplicates from responses[i]
        for i, day in enumerate(responses):
            responses[i] = set(day)
        
        # Count frequency of responses per day
        for day in responses:
            for resp in day:
                freq[resp] = (freq.get(resp, 0)+1)

        # Determine max frequency value
        max_val = max(freq.values())

        # Create new map just for responses with max frequency
        max_map = {k:v for k,v in freq.items() if v==max_val}

        # Perform manual lex comparison
        # We could also just do -> min(max_map.keys())
        lex_min = "zzzzzzzzzzzzzz"
        for k, v in max_map.items():
            for i in range(len(k)+1):
                if i == len(lex_min) or i == len(k):
                    if len(k) < len(lex_min):
                        lex_min = k
                    break
                if ord(k[i]) < ord(lex_min[i]):
                    lex_min = k
                    break
                if ord(k[i]) > ord(lex_min[i]):
                    break
        return(lex_min)