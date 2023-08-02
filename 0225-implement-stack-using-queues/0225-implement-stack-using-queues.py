class MyStack:

    def __init__(self):
        self.st = []

    def push(self, x: int) -> None:
        self.st.append(x)

    def pop(self) -> int:
        return self.st.pop(-1)

    def top(self) -> int:
        return self.st[-1]

    def empty(self) -> bool:
        if len(self.st) == 0:
            return True
        return False
    

# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()