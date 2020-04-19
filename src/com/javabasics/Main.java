package com.javabasics;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        primitive types
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        String message = "hello World" + "!!";


//        reference types
        Date now = new Date();
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;

//        shorter way of assigning all items inside an array
//        int[] numbers = {1,2,3,4,5};

//        multi-dimentional arrays
//        setting variables inside multidimentional arrays method 1
//        int[][] numbers= new int[2][3];
//        numbers[0][0] = 1;

//            setting variables inside multidimentional arrays method 2
        int[][] numbers = {{1,2,3}, {4,5,6}};

//        constant variables, "final" in front of a variable make it a const in JS
        final float pi = 3.14F;


//        arithmetic expressions
        double result = (double)10 / (double)3;

//         parenthesis sets priority in the math's order of operations
//        int x = (10+3) * 2;

//        implicit casting, when one value converts data type to another with a bigger byte size
//        byte>short>int>long>float>double, casting cannot happen in the opposite order. only when data is not lost
//        short x = 1;
//        int y = x + 2;

//            explicit casting, when casting is done manually, can only happen with compatible types.
//        Integer.parseInt(), converts string to integer(whole numbers only)
//        Double.parseDouble(), is used when conversion is done on decimal numbers
        double x = 1.1;
        int y = (int)x + 2;

//        Math.round(), turns decimal number into whole number by rounding it

//        Math.ceil(), rounds a decimal number up to nearest whole number
//          Math.floor(), rounds a decimal number down to nearest whole number
//        Math.max(1,2), returns the larger of 2 numbers
//        Math.min(1,2), returns the smaller of 2 numbers
//        Math.random(), returns a random number

//        formatting numbers
//        returning number as formatted in currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(1245678.91);

//        returning number as formatted in percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.31);

//      reading input from the user
//        parsing byte value only
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("you are " + name);

//        System.out.println(result2);

//        System.out.println(y);
//        System.out.println(Arrays.toString(number));

//        this is alike to console log in JS or print in python
//        System.out.println(Arrays.deepToString(numbers));

        // ********  mortgage calculator  ********
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTH_IN_YEAR;

        System.out.print("Period (Year): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1+monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
