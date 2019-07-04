# CodingExercisesDay042
# Valid Braces /   balanced parentheses / in a string
- Java code solved using Stack
- If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
- If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine
- After complete traversal, if there is some starting bracket left in stack return false , if the stack is empty return true.
