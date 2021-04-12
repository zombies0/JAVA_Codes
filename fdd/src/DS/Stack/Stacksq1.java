//Ques1 reverse a string using stacks
package DS.Stack;

import java.util.*;

public class Stacksq1 {

    public static void main(String[] args) {
        
        String s = "abcd";

        System.out.println(reverseS(s));

        
    }

    public static String reverseS(String s) {

        Stack<Character> stack = new Stack<>();
        
        for(char i : s.toCharArray()){
            stack.push(i);
        }

        StringBuffer b = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            b.append( stack.pop() );

        }

        return b.toString();

    }
    
}
