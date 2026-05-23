class Solution:
    def largestSquareArea(self, bottomLeft: List[List[int]], topRight: List[List[int]]) -> int:
        max_area = 0
        for i in range(len(bottomLeft)):
            for j in range(i + 1, len(bottomLeft)):
                total_x_diff = max(topRight[i][0], topRight[j][0]) - min(bottomLeft[j][0], bottomLeft[i][0])
                left_x_diff = max(bottomLeft[i][0], bottomLeft[j][0]) - min(bottomLeft[i][0], bottomLeft[j][0])
                right_x_diff = max(topRight[i][0], topRight[j][0]) - min(topRight[i][0],topRight[j][0])
                side1 = total_x_diff - right_x_diff - left_x_diff

                total_y_diff = max(topRight[i][1], topRight[j][1]) - min(bottomLeft[j][1], bottomLeft[i][1])
                top_y_diff = max(topRight[i][1], topRight[j][1]) - min(topRight[i][1], topRight[j][1])
                bottom_y_diff = max(bottomLeft[i][1], bottomLeft[j][1]) - min(bottomLeft[i][1], bottomLeft[j][1])
                side2 = total_y_diff - top_y_diff - bottom_y_diff

                if side1 <= 0 or side2 <= 0:
                    continue
                curr = min(side1, side2) ** 2
                max_area = curr if curr > max_area else max_area
        return max_area