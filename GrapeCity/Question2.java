package GrapeCity;

import java.util.Stack;

public class Question2 {

// given an Input string of paranthesis , find out the length of the 
// balanced paranthesis. 
public static void main(String[] args) {
    String input = "((()";
    int count = countValidParanthesis(input);
    System.out.println("The total number of valid in the given paranthesis are: " + count);
}

static int countValidParanthesis(String input) {
    int count = 0;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == '(') {
            stack.push(ch);
        } else {
            if (stack.size() == 0) {
                continue;
            }
            stack.pop();
            count++;
        }
    }
    return count;
  }

}
