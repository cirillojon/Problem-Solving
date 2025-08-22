class Solution:
    def minimumArea(self, grid: List[List[int]]) -> int:
        max_r = 0
        min_r = 1000
        max_c = 0
        min_c = 1000
        for r in range(0, len(grid)):
            for c in range(0, len(grid[r])):
                if grid[r][c] == 1:
                    if r < min_r:
                        min_r = r
                    if r > max_r:
                        max_r = r
                    if c < min_c:
                        min_c = c
                    if c > max_c:
                        max_c = c      
        x = (max_r - min_r) + 1
        y = (max_c - min_c) + 1
        return (x*y)