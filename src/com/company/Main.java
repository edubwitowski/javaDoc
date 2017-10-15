//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        String welcome = "Welcome!";
//        char[] chars = welcome.toCharArray();
//
//        try {
//            char lastChar = chars[chars.length];
//            System.out.println(lastChar);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
////               this is lynda video above for trycatch
/**
 * this is an example out of the lynda education videos for try catch
 */
package com.company;

import java.util.Scanner;

public class Main {


    /**
     *
     1     Make a copy of my last program(inheiritance) with a new name.
     2     @param try and catch to be used in statements any place user input
     3     @just need to link to validate the code on GitHub.
     4     */

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int value = 1;
        int selection;
        boolean senior = true;

/**
 *
 */
        while (value == 1) {
            System.out.print(" Welcome to Acme LawnService an Overview of our Company \n\n");/*This is to show the endUser the screen output*/
            System.out.print("1. Residence\n");/*.Kiosk input*/
            System.out.print("2. Business\n");/*Kiosk input second choice*/

            System.out.print("3.  Senior Discount LawnService\n\n");
            System.out.print("4.  Done: ");
            scanner.next();
            int selection = scanner.nextInt();


            try {
                switch (selection) {
                    case 1:
                        Residential();
                        break;
                    case 2:
                        commercial();
                    case 3:
                        senior();
                    case 4:
                        System.exit(status:0);
                        break;
                    default:
                        System.out.print(" Please make your Selection");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("\n________________________________\n");
        } while (selection != 4) ;
    }
}
