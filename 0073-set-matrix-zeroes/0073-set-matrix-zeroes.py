class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        row = []
        col = []

        for i in range(len(matrix)):
            if 0 in matrix[i]:
                row.append(i)
                for j in range(len(matrix[0])):
                    if matrix[i][j] == 0:
                        col.append(j)

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i in row or j in col:
                    matrix[i][j] = 0