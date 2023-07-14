class Solution(object):
    def findWords(self, words):
        res = []

        for i in range(3):
            if(i == 0):
                word = "qwertyuiop"
            elif(i == 1):
                word = "asdfghjkl"
            elif(i == 2):
                word = "zxcvbnm"

            for j in range(len(words)):
                for k in range(len(words[j])):
                    if not lower(words[j][k]) in word:
                        print("nope " + words[j] + " " + word)
                        break;
                else:
                    res.append(words[j])

        return res