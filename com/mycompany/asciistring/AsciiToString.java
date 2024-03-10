package com.mycompany.asciistring;
import java.util.Scanner;
public class AsciiToString {
    static void asciiToSentence(String str, int len)
    {
        int num = 0;
        for (int i = 0; i < len; i++) {
            num = num * 10 + (str.charAt(i) - '0');
            if (num >= 32 && num <= 122) {
                char ch = (char)num;
                System.out.print(ch);
                num = 0;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter ascii number : ");
        String str = myObj.nextLine();
        int len = str.length();
        asciiToSentence(str, len);
    }
}
/*
Certainly! The line num = num * 10 + (input.charAt(i) - '0'); is part of the process of converting a sequence of ASCII values represented as characters in a string to their corresponding numeric values.

Let's break down the components:

    input.charAt(i): This extracts the character at index i from the input string. In this case, it's a digit character representing an ASCII value.

    (input.charAt(i) - '0'): This converts the character digit into its corresponding numeric value. In Java, characters are represented as Unicode values, and by subtracting the Unicode value of the character '0', you get the actual numeric value of the digit.

    num = num * 10 + (input.charAt(i) - '0'): This line updates the variable num. It multiplies the existing value of num by 10 (shifting its digits to the left) and adds the new numeric value obtained from the current character. This process accumulates the numeric value of a sequence of digits.

For example, if input.charAt(i) is '5', and num was previously 12, this line would update num to be 120 + (53 - 48) = 125, where 53 is the Unicode value of '5', and 48 is the Unicode value of '0'. This operation is repeated for each digit in the sequence.

The entire loop iterates through the characters in the input string, converting them to numeric values and accumulating them into num. When the accumulated numeric value falls within the ASCII range (32 to 122), it is converted to the corresponding character using char, and the character is printed. The process then resets num to 0 to start accumulating the next sequence of digits.
 */