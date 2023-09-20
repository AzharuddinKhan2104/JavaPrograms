package basics;

import java.util.Scanner;

public class PrintIntegerEnteredByUser {

    public static void main(String[] args) {
        printInteger();
    }

    static void printInteger(){
        //Scanner Class object to get input from command line
        Scanner scanner = new Scanner(System.in);
        //Print message in console
        System.out.println("Enter Number : ");
        //take integer input from user
        int number =scanner.nextInt();
        System.out.println("Entered Number is : " + number);

    }
}
