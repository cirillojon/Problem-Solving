class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        
        before = False
        after = False
        
        if n == 0:
            return True
        if flowerbed[0] == 1:
            before = True
        if len(flowerbed) == 1:
            return not before
        if len(flowerbed) == 2 and before:
            return False
        if len(flowerbed) == 2 and flowerbed[1] == 1:
            return False
        if flowerbed[1] == 1:
            after = True

        for i in range(len(flowerbed)-1):

            if flowerbed[i+1] == 1:
                after = True
            else:
                after = False

            if not before and not after and flowerbed[i] != 1:
                n -= 1
                flowerbed[i] = 1

            if flowerbed[i] == 1:
                before = True
            else:
                before = False

        if not before and flowerbed[len(flowerbed)-1] != 1:
            n -= 1
            
        if n <= 0:
            return True

        return False;
 