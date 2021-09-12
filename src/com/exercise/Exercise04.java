/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
    class Exercise4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a noun: ");
            String noun = input.nextLine();
            System.out.print("Enter a verb: ");
            String verb = input.nextLine();
            System.out.print("Enter an adjective: ");
            String adjective = input.nextLine();
            System.out.print("Enter an adverb: ");
            String adverb = input.nextLine();
            System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));
        }
    }
