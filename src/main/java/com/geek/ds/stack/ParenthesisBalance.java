package com.geek.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ParenthesisBalance {

    public static void main(String[] args) {
        String input = "{[()]}";
        boolean balancedParentheses1 = isValidSymbolPattern(input);
        System.out.println("Balanced Parentheses using Stack as Deque for "+ input + " : " + balancedParentheses1);

        boolean balancedParentheses2 = isValidSymbolPatternMapStack(input);
        System.out.println("Balanced Parentheses using Map & Stack as Deque for "+ input + " : " + balancedParentheses2);
    }

    private static boolean isValidSymbolPatternMapStack(String input) {

        Map<Character, Character> expressionMap = Map.of(')','(', ']', '[', '}', '{');
        expressionMap.forEach((k, v) -> System.out.println(k + " : " + v));
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < input.length(); i++) {
            if(expressionMap.containsValue(input.charAt(i)))
                stack.offerFirst(input.charAt(i));
            else if(expressionMap.containsKey(input.charAt(i))) {
                if(stack.isEmpty() || stack.pollFirst() != expressionMap.get(input.charAt(i)))
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
    private static boolean isValidSymbolPattern(String input) {

        if(input == null || input.length() == 0)
            return false;

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if(ch == ')') {
                if(stack.peekFirst() == '(')
                    stack.pollFirst();
                else
                    return false;
            } else if(ch == '}') {
                if(stack.peekFirst() == '{')
                    stack.pollFirst();
                else
                    return false;
            } else if(ch == ']') {
                if(stack.peekFirst() == '[')
                    stack.pollFirst();
                else
                    return false;
            } else {
                stack.offerFirst(ch);
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
