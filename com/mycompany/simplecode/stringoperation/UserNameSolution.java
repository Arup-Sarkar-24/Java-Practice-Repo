
/*
The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9]
The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].
 */
package com.mycompany. com.mycompany.simplecode.stringoperation;
import java.util.Scanner;

public class UserNameSolution {
    public static String usernameValidator() {
        final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        return regularExpression;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of test cases : ");

        while (true) {
            try {
                int n = Integer.parseInt(scan.nextLine());

                while (n-- != 0) {
                    System.out.print("Enter a username: ");
                    String userName = scan.nextLine();

                    if (userName.matches(usernameValidator())) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                }

                break; // exit the loop if parsing is successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
