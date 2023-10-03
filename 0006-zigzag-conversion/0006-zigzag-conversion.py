class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        row_list = [''] * numRows
        col_count = numRows
        count = 0
        while count < len(s):
            if col_count == numRows:
                for i in range(min(numRows, len(s) - count)):
                    row_list[i]+=(s[count])
                    count += 1
                col_count = 1
            else:
                row_list[numRows-col_count]+=(s[count])
                count += 1
            col_count += 1
        return(''.join(row_list))
