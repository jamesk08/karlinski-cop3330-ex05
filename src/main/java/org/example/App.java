/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */
package org.example;
import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstInput = reader.nextLine();
        double firstNum = Double.parseDouble(firstInput);

        System.out.print("What is the second number? ");
        String secondInput = reader.nextLine();
        double secondNum =  Double.parseDouble(secondInput);

        String operationTxt = "{0} {1} {2} = {3}";
        String additionString = MessageFormat.format(operationTxt, firstNum, "+", secondNum, firstNum + secondNum);
        String subtractionString = MessageFormat.format(operationTxt, firstNum, "-", secondNum, firstNum - secondNum);
        String multiplicationString = MessageFormat.format(operationTxt, firstNum, "*", secondNum, firstNum * secondNum);
        String divisionString = MessageFormat.format(operationTxt, firstNum, "/", secondNum, firstNum / secondNum);
        String formattedString = MessageFormat.format(
            "{0}\n{1}\n{2}\n{3}",
            additionString, subtractionString, multiplicationString, divisionString
        );

        System.out.printf(formattedString);
    }
}
