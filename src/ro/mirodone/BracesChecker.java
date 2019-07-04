package ro.mirodone;

import java.util.Stack;

public class BracesChecker {


    boolean isValid(String braces){

        Stack<Character> stack = new Stack<>();
        for ( int  i =0 ; i<braces.length() ; i++) {
            char ch = braces.charAt(i);

            if( ch == '(') {
                stack.push(ch);
            }else if( ch == '{' ){
                stack.push(ch);
            }else if (ch == '['){
                stack.push(ch);
            }

            else if (ch ==')'){
                if ((!stack.isEmpty()) && stack.peek() == '('){
                    stack.pop();
                }else {
                    return false;
                }
            }

            else if (ch =='}'){
                if ((!stack.isEmpty()) && stack.peek() == '{'){
                    stack.pop();
                }else {
                    return false;
                }
            }

            else if (ch ==']'){
                if ((!stack.isEmpty()) && stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }

        } if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

}
