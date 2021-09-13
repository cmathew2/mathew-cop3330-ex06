/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package Base;

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is your current age? ");
        String age = in.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retire = in.nextLine();

        //num convertor
        int a = Integer.parseInt(age);
        int b = Integer.parseInt(retire);

        //get current year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //math processes
        int until = b - a;
        int ret = year + until;

        //challenge
        if (until <= 0) {
            System.out.println("You can already retire!");
        } else {
            //output
            System.out.println("You have " + until + " years left until you can retire. \nIt's " + year + " so you can retire in " + ret + ".");
        }
    }
}
