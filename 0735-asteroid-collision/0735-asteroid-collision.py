class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:

        length = 0
        
        while length != len(asteroids):
            length = len(asteroids)

            for i, a in enumerate(asteroids):
                last_size = abs(asteroids[i-1])
                last_dir = 1 if asteroids[i-1] > 0 else -1

                if a < 0 and last_dir < 0 or a > 0 and last_dir > 0 or i == 0:
                    continue

                if abs(a) > last_size and i != 0 and a < 0:
                    del(asteroids[i-1])

                elif abs(a) < last_size and i != 0 and a < 0:
                    del(asteroids[i])

                elif a < 0:
                    del[asteroids[i-1]]
                    del(asteroids[i-1])

        return asteroids