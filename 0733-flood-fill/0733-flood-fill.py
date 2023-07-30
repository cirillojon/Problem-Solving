class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        def fill(image, sr, sc, old_color, new_color):

            # checking indexes for out-of-bounds
            if sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]):
                return
            
            # if not the correct color to change
            if image[sr][sc] != old_color:
                return

            # set new color
            image[sr][sc] = new_color

            # traverse rest of matrix 4-directioanlly 
            fill(image,sr-1,sc,old_color,new_color)
            fill(image,sr+1,sc,old_color,new_color)
            fill(image,sr,sc-1,old_color,new_color)
            fill(image,sr,sc+1,old_color,new_color)

        # if starting color is already correct
        if image[sr][sc] == color:
            return image
        
        # call helper method using image[sr][sc]'s value as 'old_color'
        fill(image, sr, sc, image[sr][sc], color)

        return image