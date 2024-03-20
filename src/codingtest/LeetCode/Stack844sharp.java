package codingtest.LeetCode;

import java.util.Stack;

public class Stack844sharp {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != '#'){
                stack1.push(ch);
            }
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }

        for(char ch : t.toCharArray()){
            if(ch != '#'){
                stack2.push(ch);
            }
            else if(!stack2.isEmpty()){
                stack2.pop();

            }
        }


        System.out.println(stack2.toString());
        System.out.println(stack1.toString());

        if(stack1.toString().equals(stack2.toString())){
            System.out.println(true);
        } else System.out.println(false);



    }
}
