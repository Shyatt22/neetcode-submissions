class MinStack:

    def __init__(self):
        self.stack=[]

    def push(self, val: int) -> None:
        stack=self.stack
        return stack.append(val)

    def pop(self) -> None:
        stack=self.stack
        return stack.pop()

    def top(self) -> int:
        stack=self.stack
        return stack[-1]

    def getMin(self) -> int:
        return min(self.stack)
        
