package com.geek.ibm;

import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {

    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        //Pattern p = Pattern.compile("\d+\w+[!@#$%^&*()+-]+")
        Pattern digitRegex = Pattern.compile("\\d+");
        Pattern upperCaseRegex = Pattern.compile("[A-Z]+");
        Pattern lowerCaseRegex = Pattern.compile("[a-z]+");
        Pattern specialCharacter = Pattern.compile("[!@#$%^&*()+-]+");
        int count = 0;

        if(!digitRegex.matcher(password).find())
            count++;
        if(!upperCaseRegex.matcher(password).find())
            count++;
        if(!lowerCaseRegex.matcher(password).find())
            count++;
        if(!specialCharacter.matcher(password).find())
            count++;

        if(n + count < 6)
            count = count + (6 - n - count);

        return count;
    }

}
