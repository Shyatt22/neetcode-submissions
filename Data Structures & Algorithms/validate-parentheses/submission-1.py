class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        parentheses_dict={
            "[": "]",
            "(": ")",
            "{": "}"
        }

        for letter in s:
            if letter in parentheses_dict:
                stack.append(parentheses_dict[letter])
            elif not stack or stack.pop()!=letter:
                return False
    
        return not stack
