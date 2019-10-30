/*
 * Author : Aderonke Adebayo; Ariel Glenn; 	Keene Twana
 * Date : 10/29/2019
 * Project : Group Project
 */



package Assignment2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MyMenu {
    static void Menu() {
        String[] myMenu = {"1.Appetizer", "2.Breakfast", "3.Lunch", "4.Dinner", "5.Dessert", "6.Done"};
        System.out.println("Welcome. Select from one of the following:");

        for (int i = 0; i < myMenu.length; i++) {
            System.out.println(myMenu[i]);

        }
        System.out.println( "Enter your selection: ");
    }

    public static void main(String[] args) {
        String[] myArray = new String[6];
        ArrayList<Double> myList = new ArrayList<Double>();

        Scanner sc = new Scanner(System.in);

        int customerInput = 0;
        int sum = 0;

        do {
            Menu();
            customerInput = sc.nextInt();
            switch (customerInput) {
                case 1:
                    System.out.println("Please choose an item for Apps.");
                    System.out.println("1. Nachos -- $7");
                    System.out.println("2.Corn Dog Bites -- $4");
                    customerInput = sc.nextInt();
                    if (customerInput == 1) {
                        myList.add(7.00);
                    } else if (customerInput == 2) {
                        myList.add(4.00);
                    }
                    break;
                case 2:
                    System.out.println("Please choose an item for Breakfast.");
                    System.out.println("1. Pancakes -- $10");
                    System.out.println("2. Waffles -- $10");
                    customerInput = sc.nextInt();
                    if (customerInput == 1) {
                        myList.add(10.00);
                    } else if (customerInput == 2) {
                        myList.add(10.00);
                    }
                    break;
                case 3:
                    System.out.println("Please choose an item for Lunch.");
                    System.out.println("1. Hamburger -- $8");
                    System.out.println("2. Sub -- $6");
                    customerInput = sc.nextInt();
                    if (customerInput == 1) {
                        myList.add(8.00);
                    } else if (customerInput == 2) {
                        myList.add(6.00);
                    }
                    break;
                case 4:
                    System.out.println("Please choose an item Dinner.");
                    System.out.println("1. Pasta -- $12");
                    System.out.println("2. Salmon -- $13");
                    customerInput = sc.nextInt();
                    if (customerInput == 1) {
                        myList.add(12.00);
                    } else if (customerInput == 2) {
                        myList.add(13.00);
                    }
                    break;
                case 5:
                    System.out.println("Please choose an item for Dessert.");
                    System.out.println("1. Cheesecake -- $8");
                    System.out.println("2. Fudge Sundae -- $5");
                    customerInput = sc.nextInt();
                    if (customerInput == 1) {
                        myList.add(8.00);
                    }
                    else if (customerInput == 2) {
                        myList.add(5.00);
                    }
            }
            System.out.println("Are you done? If yes, enter 6. If no, press 0.");
            customerInput = sc.nextInt();
        } while (customerInput !=6);

        System.out.println("Each of your order cost " +myList);
        int size = myList.size();
        float total = 0f;
        for (int i = 0; i < size; i++) {

            total += myList.get(i) * 1.06;// this is taking out 0.06 of the total as tax
        }

        System.out.println("Your total is: $" + total);
    }

}