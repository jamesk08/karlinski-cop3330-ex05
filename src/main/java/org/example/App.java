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
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        double firstNum = scanner.nextDouble();

        System.out.print("What is the second number? ");
        double secondNum =  scanner.nextDouble();

        String messageTemplate = "{0} {1} {2} = {3}";
        String additionText = MessageFormat.format(messageTemplate, firstNum, "+", secondNum, firstNum + secondNum);
        String subtractionText = MessageFormat.format(messageTemplate, firstNum, "-", secondNum, firstNum - secondNum);
        String multiplicationText = MessageFormat.format(messageTemplate, firstNum, "*", secondNum, firstNum * secondNum);
        String divisionText = MessageFormat.format(messageTemplate, firstNum, "/", secondNum, firstNum / secondNum);

        String formattedText = MessageFormat.format(
            "{0}\n{1}\n{2}\n{3}",
            additionText,
            subtractionText,
            multiplicationText,
            divisionText
        );

        System.out.printf(formattedText);
    }
}
