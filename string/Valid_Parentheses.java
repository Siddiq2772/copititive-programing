package string;
import java.util.*;
//Day 83: Valid Parentheses** – Determine if a string of parentheses is valid (properly balanced).
/**
 * Valid_Parentheses
 */
public class Valid_Parentheses {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("answer:"+s.isValid("({[]})"));
    }

    
}
class Solution {
    public boolean isValid(String s) {
     boolean f = true;
        Stack<Character> stack = new Stack<>();
        if (s.length()%2!=0) 
            return false;
        else{
            for (char c : s.toCharArray()) {
                 if (c=='{'||c=='['||c=='(')
                    stack.push(c);                 
                else if(stack.isEmpty()) 
                    return false;
                else{
                    if(c=='}'&&stack.peek()=='{')
                        stack.pop();                    
                    else if(c==']'&&stack.peek()=='[')
                        stack.pop();
                    else if(c==')'&&stack.peek()=='(')
                        stack.pop();
                    else 
                        return false;                  
                }               
                                   
             }
            if(stack.isEmpty())
             f= true;
             else
             f= false;
        }
        return f;
    }
}