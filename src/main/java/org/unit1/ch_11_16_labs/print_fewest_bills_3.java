package org.unit1.ch_11_16_labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class print_fewest_bills_3 {
    public static void main(String[] args) {
        System.out.print("Please enter an (int) amount of money\n $");

        int amount;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                amount = input.nextInt();
            } catch (InputMismatchException e) {
                amount = 0;
                input.next(); // clear invalid input from scanner buffer
            }
            if (amount <= 0) {
                System.out.print("Please enter a positive integer.\n $");
                continue;
            }
            break;
        }

        final int[] BILL_VALUES = {100, 50, 20, 10, 5, 1};
        int totalBillCount = 0;
        int[] billCounts = new int[BILL_VALUES.length];

        for (int i = 0; i < BILL_VALUES.length; i++) {
            int count = amount / BILL_VALUES[i];
            int remainder = amount % BILL_VALUES[i];
            billCounts[i] += count;
            totalBillCount += count;
            amount = remainder;
        }

        System.out.println("It takes "+ totalBillCount + " bills to make $" + amount + ":");
        for  (int i = 0; i < BILL_VALUES.length; i++) {
            System.out.printf("  # of %ds: %d\n", BILL_VALUES[i], billCounts[i]); // " # of 50s: 1"
        }
    }
}
