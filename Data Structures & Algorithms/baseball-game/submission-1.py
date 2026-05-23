from functools import reduce
from operator import mul

class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack=[]
        for i in range(len(operations)):
            op=operations[i]
            if op.lstrip('-').isdigit():
                stack.append(int(op))
            elif (op=="+"):
                new_op_add=stack[-1] + stack[-2]
                stack.append(new_op_add)
            elif (op=="C"):
                stack.pop()
            elif (op=="D"):
                new_op_mult=stack[-1] * 2
                stack.append(new_op_mult)
        return sum(stack)