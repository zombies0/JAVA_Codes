//ques 2 check if the expression is balanced or not using stack

package DS.Stack;

import java.util.Stack;

public class Stacksq2 {

    public static void main(String[] args) {
        
        String s = "(1 + 2)";


        System.out.println(isBalanced(s));

    }
    
    public static boolean isBalanced(String s){

        Stack<Character> str = new Stack<>();
        
        for (char st : s.toCharArray()) {
            
            if (st == '(') 
                str.push(st);
            
            if (st == ')') {
                if (str.isEmpty()) return false;
                str.pop();
            }

        }

        

        return str.isEmpty();
    }

    
}
