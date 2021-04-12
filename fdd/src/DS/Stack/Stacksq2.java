//ques 2 check if the expression is balanced or not using stack

package DS.Stack;

import java.util.Stack;

public class Stacksq2 {



    public static void main(String[] args) {
        
        String s = "<{[1 + 2]}>";

        System.out.println(isBalanced(s));

    }
    
    public static boolean isBalanced(String s){

        Stack<Character> str = new Stack<>();
        
        for (char st : s.toCharArray()) {
            
            if (isLeftBracket(st)) str.push(st);      

            if (isRightBracket(st)) {

                if (str.isEmpty()) return false;
                char top = str.pop();
                if (isBracketMatch(st, top)) return false;        
            }
        } 

        return str.isEmpty();
    }

    private static boolean isLeftBracket(char st){

        return st == '(' || st == '<' || st == '[' || st == '{';
    }
    private static boolean isRightBracket(char st){

        return st == ')' || st == '>' || st == ']' || st == '}';
    }
    private static boolean isBracketMatch(char left, char right){

        return  left == ')' && right != '(' ||
                left == ']' && right != '[' ||
                left == '}' && right != '{' ||
                left == '>' && right != '<';
    }
    
}