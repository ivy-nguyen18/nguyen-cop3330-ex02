/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex02.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string?");
        String word = input.nextLine();

        System.out.printf("%s has %d characters", word, word.length());
    }
}
