class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        res = []
        map = {}
        for i, num in enumerate(groupSizes):
            if num not in map:
                map[num] = [i]
            else:
                map[num].append(i)
        
        for k, v in map.items():
            if len(map[k]) == k:
                res.append(map[k])
            else:
                for i in range(0, len(map[k]), k):
                    res.append(map[k][i:i+k])
        return res