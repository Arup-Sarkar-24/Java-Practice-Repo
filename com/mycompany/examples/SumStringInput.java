package com.mycompany.examples;
import java.util.stream.IntStream;
import java.util.Scanner;
public class SumStringInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = Integer.parseInt(myObj.nextLine());
        IntStream stream = String.valueOf(number).chars();
        int sum= stream.map(Character::getNumericValue).sum();
        System.out.println("Sum of the enter numbers is = "+sum);
    }
}
