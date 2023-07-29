class Solution:
    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
        
        count = 0
        
        while count < 4:
            top = 0
            floor = len(mat) - 1

            while top < floor:
                mat[top], mat[floor] = mat[floor], mat[top]
                top += 1
                floor -= 1

            for i in range(len(mat)):
                for j in range(i):
                    mat[i][j], mat[j][i] = mat[j][i], mat[i][j]
            
            count += 1
            if mat == target:
                return True
        
        return False