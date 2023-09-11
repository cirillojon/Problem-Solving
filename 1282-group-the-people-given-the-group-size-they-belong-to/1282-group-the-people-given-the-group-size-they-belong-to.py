class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        res = []
        size_map = {}
        for i, size in enumerate(groupSizes):
            if size not in size_map:
                size_map[size] = [i]
            else:
                size_map[size].append(i)
        
        for size, size_list in size_map.items():
            if len(size_map[size]) == size:
                res.append(size_map[size])
            else:
                for i in range(0, len(size_map[size]), size):
                    res.append(size_map[size][i:i+size])
        return res