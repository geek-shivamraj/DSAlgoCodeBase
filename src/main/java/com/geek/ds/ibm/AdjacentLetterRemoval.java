package com.geek.ds.ibm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AdjacentLetterRemoval {

    public static void main(String[] args) {

        String s = "aabbccdd";
        superReducedStringRegex(s);
        superReducedStringStack(s);
        superReducedString(s);
    }

    public static String superReducedStringRegex(String s) {
        // Write your code here
        Pattern regex = Pattern.compile("(\\w)(\\1)");
        Matcher matcher = regex.matcher(s);
        while(matcher.find()) {
            s = s.replaceAll("(\\w)(\\1)", "");
            matcher = regex.matcher(s);
        }
        if(s.isEmpty())
            return "Empty String";

        return s;

    }

    public static String superReducedStringStack(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(stack.peekFirst() != null && stack.peekFirst() == current) {
                stack.pollFirst();
            } else{
                stack.offerFirst(current);
            }
        }
        StringBuffer sb = new StringBuffer();
        Iterator itr = stack.descendingIterator();
        while(itr.hasNext()) {
            sb.append(itr.next());
        }

        if(sb.isEmpty())
            return "Empty String";

        return sb.toString();
    }

    public static String superReducedString(String s) {
        StringBuffer sb = new StringBuffer(s);
        int i = 0;
        while(i < sb.length()-1) {
            char current = sb.charAt(i);
            char next = sb.charAt(i+1);

            if(current == next) {
                sb.delete(i, i+2);
                if(i > 0)
                    i = i - 1;
            } else {
                i = i+1;
            }
        }
        if(sb.isEmpty())
            return "Empty String";

        return sb.toString();
    }
}
