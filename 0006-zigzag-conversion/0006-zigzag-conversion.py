class Solution:
    def convert(self, s: str, numRows: int) -> str:

        # ex) s='ABC', numRows=1 => ABC
        if numRows == 1:
            return s
        
        # Create str for each row
        row_list = [''] * numRows

        # Initialize counters
        count = 0
        col_count = 0

        # Loop through all letters in s
        while count < len(s):
            # Add each full column
            if col_count == 0 or col_count == numRows-1:
                for i in range(numRows):
                    # Add letter to corresponding row/str
                    row_list[i]+=(s[count])
                    count += 1
                    if count == len(s):
                        break
                col_count = 0
            # Add one letter per zigzag columb
            # 'numRows-col_count-1' ~ bottom->up
            else:
                row_list[numRows-col_count-1]+=(s[count])
                count +=1
                
            col_count += 1
        return(''.join(row_list))
        