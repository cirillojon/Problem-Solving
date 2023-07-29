class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
    
        top = 0
        floor = len(matrix) - 1
        
        while top < floor:
            matrix[top], matrix[floor] = matrix[floor], matrix[top]
            top += 1
            floor -= 1
            
        for i in range(len(matrix)):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]